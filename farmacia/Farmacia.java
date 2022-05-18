package adicional.farmacia;

import java.util.ArrayList;

public class Farmacia {
	
	private ArrayList<Medicamento> medicamentos;
	private ArrayList<Paciente> pacientes;
	
	public Farmacia() {
		this.medicamentos = new ArrayList<>();
		this.pacientes = new ArrayList<>();
	}
	
	public boolean puedeTratar(Medicamento m, Paciente p) {
		return m.puedeTratarA(p);
	}
	
	

}
