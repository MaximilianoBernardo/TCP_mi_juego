package Juego;

import Cordenadas.Coordenada;

public class Personaje {

	private Coordenada Actual;
	private Coordenada Anterior;

	private int puntos;
	
	private char personaje;

	public Personaje(int pos_x, int pos_y,char icono) {

		// TODO Auto-generated constructor stub
		Actual = new Coordenada(pos_x, pos_y);
		Anterior = new Coordenada(pos_x, pos_y);
		puntos = 0;
		personaje = icono;
	}

	public char getPersonaje() {
		return personaje;
	}

	public void setPersonaje(char personaje) {
		this.personaje = personaje;
	}

	public Coordenada getActual() {
		return Actual.GetCoordenadas();
	}

	public Coordenada getAnterior() {
		return Anterior.GetCoordenadas();
	}

	public int getPuntos() {
		return puntos;
	}

	public void sumarPuntos(int puntaje) {
		puntos += puntaje;
	}

	public void restarPuntos(int puntaje) {
		puntos -= puntaje;
		if (puntos < 0)
			puntos = 0;
	}

	
	public void Desplazar(Coordenada fin) {
		Anterior = Actual;
		Actual = fin;
	}
	
	//estos 4 estan al pedo
	public void DesplazarHaciaDerecha() {
		Anterior = Actual.GetCoordenadas();
		Actual.DesplazarHaciaDerecha();
	}

	public void DesplazarHaciaIzquierda() {
		Anterior = Actual.GetCoordenadas();
		Actual.DesplazarHaciaIzquierda();
	}

	public void DesplazarHaciaArriba() {
		Anterior = Actual.GetCoordenadas();
		Actual.DesplazarHaciaArriba();
	}

	public void DesplazarHaciaAbajo() {
		Anterior = Actual.GetCoordenadas();
		Actual.DesplazarHaciaAbajo();
	}

}
