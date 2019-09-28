package Tests;

import java.util.List;

import org.junit.Test;


import Cordenadas.Coordenada;
import Juego.Mapa;
import Juego.Personaje;
import Juego.MapasDisponibles;


public class MapaTest {

	
	@Test
	public void mapaTest() {
		
		
		
		Mapa map = new Mapa(MapasDisponibles.Mapa1,MapasDisponibles.Mapa1_inicio, new Personaje[] {new Personaje(MapasDisponibles.Mapa1_inicio.getX(),MapasDisponibles.Mapa1_inicio.getY(),'A')});
		
		List<Coordenada> caminos = map.CaminosPosibles(new Coordenada(3,1)) ;
		
		for (Coordenada pos : caminos){
			System.out.println(pos);
		}
		
		
	}
	
	
	
}
