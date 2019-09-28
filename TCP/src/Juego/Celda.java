package Juego;

public class Celda {

	private char Tipo;

	public char getTipo() {
		return Tipo;
	}

	public Celda(char tipo) {
		// TODO Auto-generated constructor stub

		Tipo = tipo;
	}

	static final char bloque = 'X';
	static final char camino = 'C';
}
