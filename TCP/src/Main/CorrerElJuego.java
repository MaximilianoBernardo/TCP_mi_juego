package Main;

import Cordenadas.Coordenada;
import Juego.MapasDisponibles;
import Juego.Partida;
import Juego.Personaje;

public class CorrerElJuego {

	
	public static void main(String[] args) {
			//los personajes siempre tienen que empezar en una celdaCamino
			//por ahora para poder mostrar el mapa por pantalla voy guardar los personajes en las celdaCamino
			//despues cuando pueda mostrarlo de otra forma ya no uso mas los personajes en las celdasCamino
			Personaje jugadores[] = new Personaje[4];
			
			int[][] mapa= MapasDisponibles.Mapa3;
			
			Coordenada inicio = MapasDisponibles.Mapa3_inicio;
			
			for (int i = 0; i < jugadores.length; i++) {
				jugadores[i] = new Personaje(inicio.getX(),inicio.getY(),'i');
			}
			jugadores[0].setPersonaje('A');
			jugadores[1].setPersonaje('B');
			jugadores[2].setPersonaje('C');
			jugadores[3].setPersonaje('D');
			

					
			Partida juego=new Partida(mapa,inicio,jugadores);
			
			
			juego.JugarPartida();
			
		
			
			

	}
	
	
}
