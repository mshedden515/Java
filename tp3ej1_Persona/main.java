package tp3_persona;

import java.time.LocalDate;

public class main {

	public static void main(String[] args) {
		
		persona test = new persona(26550100, "Luis", "Perez");
		double Altura = 1.80;
		double Peso = 75;
		LocalDate FechaNac = LocalDate.of(2021, 4, 15);
		
		System.out.println("El DNI es: " + test.getDNI());
		System.out.println("El IMC de " + test.getNombre() + " es: " + test.imc(Altura, Peso));
		System.out.println(test.Esta_en_forma(Altura, Peso));
		System.out.println(test.Cumpliendo_años(FechaNac));
		System.out.println(test.IsAdult(FechaNac));
		System.out.println(test.CanIvote(FechaNac));
	}
	
}
