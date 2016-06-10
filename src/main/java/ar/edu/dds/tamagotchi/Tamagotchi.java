package ar.edu.dds.tamagotchi;

public class Tamagotchi {
	private Estado estado;
	private int nivel;
	private int vecesQueJugo;

	public Tamagotchi() {
		nivel = 0;
		vecesQueJugo = 0;
	}

	public void comer() {
		estado.comer(this);
	}

	public void jugar() {
		estado.jugar(this);
	}

	public boolean puedeJugar() {
		return estado.puedeJugar();
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

	public int obtenerVecesQueJugo() {
		return vecesQueJugo;
	}

	public void incrementarVecesQueJugoEn(int unaCantidad) {
		vecesQueJugo += unaCantidad;
	}
}