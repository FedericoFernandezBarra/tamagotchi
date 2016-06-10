package ar.edu.dds.tamagotchi;

public interface Estado {
	public void comer(Tamagotchi tamagotchi);

	public void jugar(Tamagotchi tamagotchi);

	public boolean puedeJugar();
}