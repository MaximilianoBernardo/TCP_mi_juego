package Juego;

import java.util.LinkedList;
import java.util.List;

public class CeldaCamino extends Celda {


	private boolean PoseeJuego;
	//si en esa casilla se dispara un juego entonces esto es true
	//si se quisiera especificar el juego adisparar entonces habria que hacerlo con otra cosa
	
	private List<Personaje> jugadoresEnCelda =new LinkedList<Personaje>();
	
	public CeldaCamino(boolean juego) {
		super(Celda.camino);
		// TODO Auto-generated constructor stub
		PoseeJuego = juego;
	}
	
	public char[] jugadores() {
		char[] jugadores=new char[jugadoresEnCelda.size()];
		
		for(int i=0;i<jugadores.length;i++)
			jugadores[i]= jugadoresEnCelda.get(i).getPersonaje();
		return jugadores;
	}
	
	//geters y seters
	public void addPersonaje(Personaje jugador) {
		jugadoresEnCelda.add(jugador);
	}
	
	public void removePersonaje(Personaje jugador) {
		jugadoresEnCelda.remove(jugador);
	}
	
	public List<Personaje> getJugadoresEnCelda() {//por ahora creo que esto esta al pedo
		return new LinkedList<Personaje>(jugadoresEnCelda);
	}

	public void setJugadoresEnCelda(List<Personaje> jugadoresEnCelda) {//por ahora creo que esto esta al pedo
		this.jugadoresEnCelda = jugadoresEnCelda;
	}
	
	
	public boolean isPoseeJuego() {
		return PoseeJuego;
	}



}
