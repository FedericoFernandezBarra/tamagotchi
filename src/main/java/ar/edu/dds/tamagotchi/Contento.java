package ar.edu.dds.tamagotchi;

public class Contento implements Estado {
	private Tamagotchi tamagotchi;
	private int vecesQueJugo;

	public Contento(Tamagotchi tamagotchi) {
		this.tamagotchi = tamagotchi;
		vecesQueJugo = 0;
	}

	@Override
	public void comer() {
		tamagotchi.aumentarNivel(1);
	}

	@Override
	public void jugar() {
		tamagotchi.aumentarNivel(2);
		vecesQueJugo++;
		if (vecesQueJugo == 5) {
			tamagotchi.cambiarEstado(new Hambriento(tamagotchi));
		}
	}
}