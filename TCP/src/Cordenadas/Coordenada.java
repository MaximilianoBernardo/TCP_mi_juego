package Cordenadas;

public class Coordenada {

	private int X = 0;
	// la coordenada x contempla desplazamientos hacia arriba y hacia abajo
	private int Y = 0;
	// la coordenada y contempla desplazamientos hacia la derecha y hacia la//
	// izquierda
	// esto es asi para que se pueda acceder a la matriz directo, i=x j=y
	public Coordenada(int pos_x, int pos_y) {
		// TODO Auto-generated constructor stub
		X = pos_x;
		Y = pos_y;
	}

	public Coordenada GetCoordenadas() {
		return new Coordenada(X, Y);
	}

	public int getX() {
		return X;
	}

	public void setX(int x) {
		X = x;
	}

	public int getY() {
		return Y;
	}

	public void setY(int y) {
		Y = y;
	}

	// desplazamientos
	public void DesplazarHaciaDerecha() {
		Y += 1;
	}

	public void DesplazarHaciaIzquierda() {
		Y -= 1;
	}

	public void DesplazarHaciaArriba() {
		X -= 1;
	}

	public void DesplazarHaciaAbajo() {
		X += 1;
	}

	@Override
	public String toString() {
		return "Coordenada [X=" + X + ", Y=" + Y + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + X;
		result = prime * result + Y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coordenada other = (Coordenada) obj;
		if (X != other.X)
			return false;
		if (Y != other.Y)
			return false;
		return true;
	}

}
