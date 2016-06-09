package ar.edu.dds.tamagotchi;

public class Tamagotchi {
	private Estado estado;
	private int nivel;

	public Tamagotchi() {
		nivel = 0;
	}

	public void comer() {
		estado.comer();
	}

	public void jugar() {
		estado.jugar();
	}

	public Estado obtenerEstado() {
		return estado;
	}

	public void cambiarEstado(Estado estado) {
		this.estado = estado;
	}

	public int obtenerNivel() {
		return nivel;
	}

	public void aumentarNivel(int cantidadDeNiveles) {
		nivel += cantidadDeNiveles;
	}
}