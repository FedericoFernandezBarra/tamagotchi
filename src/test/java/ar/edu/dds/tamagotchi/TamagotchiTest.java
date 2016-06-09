package ar.edu.dds.tamagotchi;

import org.junit.Test;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import org.junit.Assert;

public class TamagotchiTest {
	private Tamagotchi tamagotchi = new Tamagotchi();
	
	@Test
	public void comerEstandoHambrientaSePoneContenta() {
		tamagotchi.cambiarEstado(new Hambriento(tamagotchi));
		tamagotchi.comer();
		Assert.assertTrue(tamagotchi.obtenerEstado() instanceof Contento);
	}
	
	@Test
	public void comerEstandoContentaSubeDeNivel() {
		tamagotchi.cambiarEstado(new Contento(tamagotchi));
		tamagotchi.comer();
		Assert.assertEquals(1, tamagotchi.obtenerNivel());
	}
	
	@Test
	public void comerDosVecesEstandoContentaSubeDosNiveles() {
		tamagotchi.cambiarEstado(new Contento(tamagotchi));
		tamagotchi.comer();
		tamagotchi.comer();
		Assert.assertEquals(2, tamagotchi.obtenerNivel());
	}
	
	@Test
	public void comerYEstaDeMalHumorHaceMasDe80MinutosOMasSePoneContenta() {
		LocalDateTime horaDeHoyRestadaPorMasDe80Minutos = LocalDateTime.now().minus(81, ChronoUnit.MINUTES);
		tamagotchi.cambiarEstado(new MalHumor(tamagotchi, horaDeHoyRestadaPorMasDe80Minutos));
		tamagotchi.comer();
		Assert.assertTrue(tamagotchi.obtenerEstado() instanceof Contento);
	}
	
	@Test
	public void comerYEstaDeMalHumorHaceMenosDe80MinutosNoCambiaSuEstado() {
		tamagotchi.cambiarEstado(new MalHumor(tamagotchi));
		tamagotchi.comer();
		Assert.assertTrue(tamagotchi.obtenerEstado() instanceof MalHumor);
	}
	
	@Test
	public void jugarEstandoContentaSubeDosNiveles() {
		tamagotchi.cambiarEstado(new Contento(tamagotchi));
		tamagotchi.jugar();
		Assert.assertEquals(2, tamagotchi.obtenerNivel());
	}
	
	@Test
	public void jugarYEstaDeMalHumorSePoneContenta() {
		tamagotchi.cambiarEstado(new MalHumor(tamagotchi));
		tamagotchi.jugar();
		Assert.assertTrue(tamagotchi.obtenerEstado() instanceof Contento);
	}
	
	@Test
	public void jugarYEstaHambrientaSePoneDeMalHumor() {
		tamagotchi.cambiarEstado(new Hambriento(tamagotchi));
		tamagotchi.jugar();
		Assert.assertTrue(tamagotchi.obtenerEstado() instanceof MalHumor);
	}
}