package Tests;

import org.junit.Test;

import Cordenadas.Coordenada;
import Juego.MapasDisponibles;
import Juego.Partida;
import Juego.Personaje;
import Ventanas.VerMapa;

public class PartidaTest {

	@Test
	public void partidaTest() {
		//los personajes siempre tienen que empezar en una celdaCamino
		
		Personaje jugadores[] = new Personaje[3];
		
		int[][] mapa= MapasDisponibles.Mapa2;
		
		Coordenada inicio = MapasDisponibles.Mapa2_inicio;
		
		for (int i = 0; i < jugadores.length; i++) {
			jugadores[i] = new Personaje(inicio.getX(),inicio.getY(),'i');
		}
		jugadores[0].setPersonaje('A');
		jugadores[1].setPersonaje('B');
		jugadores[2].setPersonaje('C');
		//jugadores[3].setPersonaje('D');
		

				
		Partida juego=new Partida(mapa,inicio,jugadores);
		
		
		juego.JugarPartida();
		
		String mapita = juego.MostrarMapa();
		
		
//		VerMapa frame = new VerMapa(mapita);
//		frame.setVisible(true);
//		while(true) {
//			
//		}
		
		
	}
	
	
	
}
