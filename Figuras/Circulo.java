package Figuras;

public class Circulo {

	private String nombre;
	private double radio;
	
	public Circulo(String nombre, double radio) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public double getPerimetro() {
		return 2 * Math.PI * this.radio;
	}
	
	public double getArea() {
		return Math.PI * Math.pow(this.radio);
	}
	
	
}
