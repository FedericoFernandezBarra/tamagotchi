package ar.edu.dds.tamagotchi;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class MalHumor implements Estado {
	Tamagotchi tamagotchi;
	LocalDateTime tiempoQueComenzoMalHumorado;

	public MalHumor(Tamagotchi tamagotchi) {
		this.tamagotchi = tamagotchi;
		tiempoQueComenzoMalHumorado = LocalDateTime.now();
	}

	public MalHumor(Tamagotchi tamagotchi, LocalDateTime tiempoQueComenzoMalHumorado) {
		this.tamagotchi = tamagotchi;
		this.tiempoQueComenzoMalHumorado = tiempoQueComenzoMalHumorado;
	}

	@Override
	public void comer() {
		if (tiempoQueLlevaMalHumorado() > 80) {
			tamagotchi.cambiarEstado(new Contento(tamagotchi));
		}
	}

	@Override
	public void jugar() {
		tamagotchi.cambiarEstado(new Contento(tamagotchi));
	}

	@Override
	public boolean puedeJugar() {
		return true;
	}

	public long tiempoQueLlevaMalHumorado() {
		return ChronoUnit.MINUTES.between(tiempoQueComenzoMalHumorado, LocalDateTime.now());
	}
}