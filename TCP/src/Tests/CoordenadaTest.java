package Tests;

import org.junit.Test;

import Cordenadas.Coordenada;

public class CoordenadaTest {

	@Test
	public void coordenadaTest() {
		
		Coordenada pos = new Coordenada(0,0);
		
		System.out.println(pos);
		pos.DesplazarHaciaAbajo();
		System.out.println(pos);
		pos.DesplazarHaciaArriba();
		System.out.println(pos);
		pos.DesplazarHaciaDerecha();
		System.out.println(pos);
		pos.DesplazarHaciaIzquierda();
		System.out.println(pos);
	}
	
	
	
}
