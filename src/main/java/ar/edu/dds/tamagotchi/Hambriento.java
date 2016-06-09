package ar.edu.dds.tamagotchi;

public class Hambriento implements Estado {
	private Tamagotchi tamagotchi;

	public Hambriento(Tamagotchi tamagotchi) {
		this.tamagotchi = tamagotchi;
	}

	@Override
	public void comer() {
		tamagotchi.cambiarEstado(new Contento(tamagotchi));
	}
	
	// Una mascota puede jugar si está contenta o aburrida, si está hambrienta no. 
	
	// Cuando una mascota juega, pasa lo siguiente:
	// Se pone de mal humor si esta hambrienta.

	// Se contradice el enunciado?
	// ¿¿Aburrida?? ¿Cuando aparecio ese estado?
	@Override
	public void jugar() {
		tamagotchi.cambiarEstado(new MalHumor(tamagotchi));
	}
}