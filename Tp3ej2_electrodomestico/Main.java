package Tp3_electrodomestico;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		electrodomestico e = new electrodomestico();
		
		if (e.bajoconsumo())
			System.out.println("El electrodomestico es bajo consumo");
		else
			System.out.println("El electrodomestico No es bajo consumo");
		
		if (e.AltaGama())
			System.out.println("El electrodomestico es alta gama. Balance: " + e.getBalance());
		else
			System.out.println("El electrodomestico No es alta gama. Balance: " + e.getBalance());
		}		
}
