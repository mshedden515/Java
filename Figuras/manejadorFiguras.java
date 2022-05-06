package Figuras;

public class manejadorFiguras {
	
	public <Rectangulo> void imprimir(Rectangulo r) {
		System.out.println(r.getDatosCompletos());
	}
	
	public static void main(String[] args) {
		Rectangulo r1 = new Rectangulo ("R1", 10, 5);
		
		ManejadorFiguras mf = new ManejadorFiguras();
		
		mf.imprimir(r1);
		
		circulo c1 = new circulo ("c1", 5);
	}
}
