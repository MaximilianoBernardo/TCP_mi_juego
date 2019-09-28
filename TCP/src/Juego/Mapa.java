package Juego;

import java.util.LinkedList;
import java.util.List;

import Cordenadas.Coordenada;

public class Mapa {


	private Celda[][] Mapa ;


	public Mapa(int[][] mapa,Coordenada inicio,Personaje[] jugadores) {
		// TODO Auto-generated constructor stub
		
		Mapa = new Celda[mapa.length][];
		
		for (int i = 0; i < mapa.length; i++) {
			Mapa[i] = new Celda[mapa[i].length];
			
			for (int j = 0; j < mapa[i].length; j++) {

				if (mapa[i][j] == 0 )
					Mapa[i][j] = new CeldaBloque();
				else
					Mapa[i][j] = new CeldaCamino(false);
			}
		}
		int x,y;
		x = inicio.getX();
		y = inicio.getY();
		for(int i =0;i<jugadores.length;i++) {
			((CeldaCamino)Mapa[x][y]).addPersonaje(jugadores[i]);
		}
		
	}

	private boolean EsCamino(int pos_x, int pos_y) {// lo uso para saber si en esa celda es un camino o no
		return Mapa[pos_x][pos_y].getTipo() == 'C';
	}
	
	public List<Coordenada> CaminosPosibles(Coordenada posicion) {// debuelvo una lista con los caminos posibles a
																	// partir de esas coordenadas

		List<Coordenada> caminos = new LinkedList<Coordenada>();

		int x,y;
		x = posicion.getX();
		y = posicion.getY();
		if (this.EsCamino( x- 1, y))
			caminos.add(new Coordenada(x - 1, y));

		if (this.EsCamino(x + 1, y))
			caminos.add(new Coordenada(x + 1, y));

		if (this.EsCamino(x, y - 1))
			caminos.add(new Coordenada(x, y - 1));

		if (this.EsCamino(x, y + 1))
			caminos.add(new Coordenada(x, y + 1));

		return caminos;
	}

	public void DesplazarPersonaje(Personaje jugador, Coordenada fin) {

		int x = jugador.getActual().getX();
		int y = jugador.getActual().getY();
		
		CeldaCamino camino = (CeldaCamino) Mapa[x][y];

		camino.removePersonaje(jugador);

		camino = (CeldaCamino) Mapa[fin.getX()][fin.getY()];

		camino.addPersonaje(jugador);

	}
	
	
	public String MostrarMapa() {//esto pora hora funciona solo para 4 jugadores
		
		System.out.println();
		String mapita="";
		
		System.out.print("    ");//muestro la enumeracion de las columnas
		for(int i=0;i<13;i++)
			System.out.printf("%-4d ",i);
		System.out.println();
		
		
		
		for(int i=0;i<Mapa.length;i++) {
			System.out.printf("%-2d| ",i);
			mapita+="|";
			for(int j=0;j<Mapa[i].length;j++) {
				
				if( Mapa[i][j].getTipo()== 'X') {
					System.out.print("XXXX ");
					mapita+="XXXX ";
				}
				else {
					char jugadores[]= ((CeldaCamino)Mapa[i][j]).jugadores();
					
					for(int k=0;k<jugadores.length;k++) {
						System.out.print(jugadores[k]);
						mapita+=jugadores[k];
					}
						
					
					for(int k=0;k<4-jugadores.length;k++) {
						System.out.print("-");
						mapita+="H";
					}
						
					System.out.print(" ");
					mapita+=" ";
				}
				
			}
			System.out.println("|");
			mapita+="|\n";
		}
		

		return mapita;
	}

}
