package Tests;

import org.junit.Test;

import Juego.Dado;

public class DadoTest {

	@Test
	public void tirarDadoTest() {

		for (int i = 0; i < 1000; i++)
			System.out.println(Dado.TirarDado());

	}

}
