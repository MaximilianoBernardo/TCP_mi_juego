package Juego;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Cordenadas.Coordenada;

public class Partida {

	private Mapa mapa;

	private Personaje[] Jugadores;

	public Partida(int[][] mapa,Coordenada inicio,Personaje[] jugadores) {
		// TODO Auto-generated constructor stub

		this.Jugadores = jugadores;
		this.mapa = new Mapa(mapa,inicio, jugadores);

	}

	public void JugarPartida() {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		
		boolean NoGanaron = true;
		
		int turno = 0, ronda = 1, tirada, jugadoresTotales = Jugadores.length;
		
		boolean primeraMano[]= new boolean[jugadoresTotales];
		for(int i=0; i<jugadoresTotales;i++) 
			primeraMano[i]=true;
		
		do {

			this.BorarPantalla();
			
			this.MostrarMapa();
			
			System.out.println("*********************************************");

			tirada = this.ventanaJugadorDado(turno, jugadoresTotales);
			
			while (tirada > 0) {

				Coordenada caminoElejido = this.ElejirCamino(primeraMano, turno, sc);
				
				mapa.DesplazarPersonaje(Jugadores[turno], caminoElejido);
				//desplazo el personaje en el mapa y cambio las cordenadas actul y anterior del personaje
				Jugadores[turno].Desplazar(caminoElejido);
				
				System.out.println("jugador: "+(turno+1)+" se desplaza a:  "+caminoElejido);
				
				tirada--;
				this.MostrarMapa();
			}
			if (ronda == jugadoresTotales)NoGanaron = false;// este if se reemplazaria con la condicion de corte
			// puede ser el que llegue hasta tal puntaje o algo asi
			ronda++;
			turno = (turno + 1) % jugadoresTotales;
			System.out.println("*********************************************");
		} while (NoGanaron);
		
		this.BorarPantalla();
		
		this.ventanaJugadorPuntos();
		
		this.MostrarMapa();
		
		sc.close();
	}
	
	public String MostrarMapa() {//al pedo por ahora
		return mapa.MostrarMapa();
	}
	
	private void BorarPantalla() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            /*No hacer nada*/
        }		
	}
	
	private void ventanaJugadorPuntos() {
		System.out.println("**TERMINO EL JUEGO**");
		System.out.println("jugador | puntos ");
		for(int i=0;i<Jugadores.length;i++)
			System.out.printf("%-8d|%-7d\n",i+1,Jugadores[i].getPuntos());
	}
	
	
	private Coordenada ElejirCamino(boolean[] primeraMano,int turno,Scanner sc) {
		
		int respuesta;
		List<Coordenada> caminosPosibles = mapa.CaminosPosibles(Jugadores[turno].getActual());
		
		caminosPosibles.remove(Jugadores[turno].getAnterior());
			

		if ( caminosPosibles.size() >1 || primeraMano[turno]  ) {

			System.out.println("una encuzijada... que desea hacer?");
			for (int i = 0; i < caminosPosibles.size(); i++) {
				System.out.println("---" + (i + 1) + "--" + caminosPosibles.get(i));
			}
			
			System.out.print("Respuesta: ");
			respuesta = sc.nextInt();
			System.out.println();
			
			while (respuesta < 1 || respuesta > caminosPosibles.size()) {
				System.out.println("reingrese su respuesta porfavor...");
				
				System.out.print("Respuesta: ");
				respuesta = sc.nextInt();
				System.out.println();
			}
			
			primeraMano[turno]=false;
		} else
			respuesta = 1;
		
		
		return caminosPosibles.get(respuesta-1);
	}
	
	private int ventanaJugadorDado(int turno, int jugadoresTotales) {
		int  tirada;
		
		System.out.println("es el turno del jugador: " + ((turno % jugadoresTotales) + 1)+"--"+Jugadores[turno%jugadoresTotales].getPersonaje());
		
		System.out.println("tirando el Dado..");
		
		tirada = Dado.TirarDado();
		
		System.out.println("salio un: " + tirada);
		
		return tirada;
	}
	
	
	
}
