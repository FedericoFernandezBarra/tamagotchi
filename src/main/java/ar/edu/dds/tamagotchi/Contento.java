package ar.edu.dds.tamagotchi;

public class Contento implements Estado {

	@Override
	public void comer(Tamagotchi tamagotchi) {
		tamagotchi.aumentarNivel(1);
	}

	@Override
	public void jugar(Tamagotchi tamagotchi) {
		tamagotchi.aumentarNivel(2);
		tamagotchi.incrementarVecesQueJugoEn(1);
		if (tamagotchi.obtenerVecesQueJugo() > 5) {
			tamagotchi.cambiarEstado(new Hambriento());
		}
	}

	@Override
	public boolean puedeJugar() {
		return true;
	}
}