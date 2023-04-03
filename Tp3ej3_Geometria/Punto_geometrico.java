package Tp3ej3_Geometria;

public class Punto_geometrico {
	private int X = 0;
	private int Y = 0;
	
	
	public int DesplazarX(int X1) {
		return (X + X1);
	}
	
	public int DesplazarY(int Y1) {
		return (Y + Y1);
	}
	
	//distancia euclidea
	public double DistanciaXY(int X1, int Y1) {
		return (Math.sqrt(Math.pow(X-X1,2) + (Math.pow(Y-Y1,2)))); 
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
	
	public Punto_geometrico(int X, int Y) {
		this.X = X;
		this.Y = Y;
	}

	public Punto_geometrico() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Punto_geometrico [X=" + X + ", Y=" + Y + "]";
	}
	
	
}
