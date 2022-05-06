package Figuras;

public class rectangulo {

	//Atributos de la clase
	private String nombre;
	private int lado1, lado2;

	//Constructor (parametros) Uso "This" cuando hago referencia al parametro
	public Rectangulo(String nombre, int lado, int lado2) {
		this.nombre = nombre
		this.lado1 = lado1;
		this.lado2 = lado2;
	}
	
	//De esta forma reuso el contructor anterior
	public Rectangulo(String nombre) {
		this(nombre, 10, 10);
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getLado1() {
		return lado1;
	}

	public void setLado1(int lado1) {
		this.lado1 = lado1;
	}

	public int getLado2() {
		return lado2;
	}

	public void setLado2(int lado2) {
		this.lado2 = lado2;
	}
	
	public double perimetro() {
		return (this.lado1 * 2) + (this.lado2 * 2);
	}
	
	public double getArea() {
		return this.lado1 * this.lado2;
	}
	
	public getDatosCompletos() {
		
	}
}

