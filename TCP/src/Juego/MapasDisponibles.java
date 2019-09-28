package Juego;

import Cordenadas.Coordenada;

public class MapasDisponibles {

	//0 para una celda con bloque los bordes de la matriz siempre tiene que ser 0 eje ariiba de un 1 no puede no haber nada
	//1 para una celda de camino sin juego
	//asignar diferentes numeros dependiendo sea el juego
	
	
	public final static int[][] Mapa1= {//8x8
					{0,0,0,0,0,0,0,0},
					{0,1,1,1,1,1,1,0},
					{0,1,0,1,0,0,1,0},
					{0,1,1,1,1,1,1,0},
					{0,1,0,0,1,0,1,0},
					{0,1,0,0,1,0,1,0},
					{0,1,1,1,1,1,1,0},
					{0,0,0,0,0,0,0,0},
			};
	
	public final static Coordenada Mapa1_inicio=new Coordenada(1,1);
	
	public final static int[][] Mapa2= {//mapa iregular
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,1,1,1,1,0},
			{0,1,1,1,1,0,0,1,0},
			{0,1,0,0,1,0,0,1,0,0},
			{0,1,1,1,1,1,1,1,0},
			{0,1,0,0,1,0,0,0},
			{0,1,1,1,1,0},
			{0,1,0,0,1,0},
			{0,1,1,1,1,0},
			{0,0,0,0,0},
	};
	
	public final static Coordenada Mapa2_inicio=new Coordenada(1,4);
	
	public final static int[][] Mapa3= {
			{0,0,0,0,0,0,0,0,0,0,0,0},
			{0,1,1,1,1,1,1,1,1,1,1,1},
			{0,1,0,0,0,1,0,1,0,1,1,0},
			{0,1,0,0,0,1,0,1,1,1,1,0},
			{0,1,1,1,1,1,0,0,1,0,1,0},
			{0,1,0,0,0,1,1,1,1,1,1,0},
			{0,1,0,0,0,1,0,0,0,0,0,0},
			{0,1,0,0,1,1,0},
			{0,1,0,0,1,0},
			{0,1,0,0,1,0},
			{0,1,0,0,1,0},
			{0,1,1,1,1,0},
			{0,0,0,0,0,0},
	};
	
	public final static Coordenada Mapa3_inicio=new Coordenada(1,1);
	
	
	
}
