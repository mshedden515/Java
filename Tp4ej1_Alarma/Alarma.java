package Tp4ej1_Alarma;

public class Alarma {

	private boolean VidrioRoto = false;
	private boolean PuertaVentanaAbierta = false;
	private boolean Movimiento = false;
	
	//Comprobacion total
	public boolean comprobar() {
		if (VidrioRoto || PuertaVentanaAbierta || Movimiento)
			return true;
		return false;
	}

	public boolean isVidrioRoto() {
		return VidrioRoto;
	}

	public void setVidrioRoto(boolean vidrioRoto) {
		VidrioRoto = vidrioRoto;
	}

	public boolean isPuertaVentanaAbierta() {
		return PuertaVentanaAbierta;
	}

	public void setPuertaVentanaAbierta(boolean puertaVentanaAbierta) {
		PuertaVentanaAbierta = puertaVentanaAbierta;
	}

	public boolean isMovimiento() {
		return Movimiento;
	}

	public void setMovimiento(boolean movimiento) {
		Movimiento = movimiento;
	}
	
}
