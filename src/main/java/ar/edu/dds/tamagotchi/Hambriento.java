package ar.edu.dds.tamagotchi;

public class Hambriento implements Estado {

	@Override
	public void comer(Tamagotchi tamagotchi) {
		tamagotchi.cambiarEstado(new Contento());
	}

	// Una mascota puede jugar si está contenta o aburrida, si está hambrienta
	// no.

	// Cuando una mascota juega, pasa lo siguiente:
	// Se pone de mal humor si esta hambrienta.

	// Se contradice el enunciado?
	// ¿¿Aburrida?? ¿Cuando aparecio ese estado?
	@Override
	public void jugar(Tamagotchi tamagotchi) {
		tamagotchi.cambiarEstado(new MalHumor(tamagotchi));
	}

	@Override
	public boolean puedeJugar() {
		return true;
	}
}