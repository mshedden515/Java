package Tp4ej1_Alarma;

import java.util.Scanner; 

public class Control_Alarma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);

		Alarma A = new Alarma();
		AlarmaLuminosa AL = new AlarmaLuminosa();
		A.setMovimiento(true);
		System.out.println("Comprobar alarma? (SI/NO)");
		String r = entrada.nextLine();
		if (r.contentEquals("si")) {
			if (A.comprobar()) {
				AL.isActivada();
				System.out.println("Alarma Activada");
				}
			else
				System.out.println("Alarma Desactivada");
			}
		System.out.println("Exitos");
	}

}
