package tp3_persona;

import java.time.LocalDate;
import java.time.Period;

public class persona {

	private int DNI;
	private LocalDate fechanac = LocalDate.of(2000, 1, 1); 
	private String Sexo = "Femenino"; 
	private String nombre = "N";
	private String apellido = "N";
	private double peso = 1;
	private double altura = 1;
	
	//Constructors 
	public persona(int DNI) {
		this.DNI = DNI;
	}
	
	public persona(int DNI, String Nombre, String Apellido) {
		this.DNI = DNI;
		this.nombre = Nombre;
		this.apellido = Apellido;
	}
	
	public persona(int DNI, String Nombre, String Apellido, LocalDate FechaNac) {
		this.DNI = DNI;
		this.nombre = Nombre;
		this.apellido = Apellido;
		this.fechanac = FechaNac;
	}
	
	//End Constructors
	
	public LocalDate getFechanac() {
		return fechanac;
	}
	public void setFechanac(LocalDate fechanac) {
		this.fechanac = fechanac;
	}
	public String getSexo() {
		return Sexo;
	}
	public void setSexo(String sexo) {
		Sexo = sexo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso (double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public int getDNI() {
		return DNI;
	}
	
	public double imc(double Altura, double Peso) {
		return (Peso / (Altura*Altura));
	}
	
	public String Esta_en_forma(double Altura, double Peso) {
		if ((imc(Altura, Peso) >= 18.5) && (imc(Altura, Peso) <= 25))
			return "Est� en forma";
		else
			return "No est� en forma";
	}
	
	public String Cumpliendo_a�os(LocalDate FechaNac) {
		LocalDate Hoy = LocalDate.now();
		if ((Hoy.getYear() > FechaNac.getYear()) 
			&& (Hoy.getMonth() == FechaNac.getMonth()) 
			&& ((Hoy.getDayOfMonth() == FechaNac.getDayOfMonth())))
			return "Hoy es tu cumplea�os";
		else
			return "Hoy no es tu cumplea�os";
	}
	
	//Limit N to compare to period.getYears
	public Boolean YearPlusN(LocalDate FechaNac, int N) {
		LocalDate Hoy = LocalDate.now();
		Period periodo = Period.between(FechaNac, Hoy);
		if (periodo.getYears() > N)
			return true;
		else
			return false;
	}
	
	public String IsAdult (LocalDate FechaNac) {
		if (YearPlusN(FechaNac, 18))
			return ("Es mayor de 18 a�os");
		else
			return ("Es menor de 18 a�os");
	}
	
	public String CanIvote(LocalDate FechaNac) {
		if (YearPlusN(FechaNac, 16))
			return ("Es mayor de 16, puede votar");
		else
			return ("Es menor de 16, no puede votar");
	}
}
