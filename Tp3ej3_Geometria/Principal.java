package Tp3ej3_Geometria;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner lectura = new Scanner (System.in);
		Punto_geometrico P = new Punto_geometrico();
		Punto_geometrico P1 = new Punto_geometrico(3,1);
		
		System.out.println("Ingrese punto X: ");
		int X = lectura.nextInt();
		P.setX(X);
		System.out.println("Ingrese punto Y: ");
		int Y = lectura.nextInt();
		P.setY(Y);
		
		System.out.println("El punto X es: " + P.getX() + " y el punto Y es: " + P.getY());
		System.out.println("La distancia a punto P1 es: " + P1.DistanciaXY(X,Y));
		
		

		
	}

}
