package Coche;

public class Autobus extends Vehiculo{
	
	private int numPlazas;
	
	public Autobus(String matricula, String modelo, String potenciaCV, int numPlazas) {
		
		super(matricula, modelo, potenciaCV);
		
		this.numPlazas = numPlazas;
		
	}

	public int getNumPlazas() {
		return numPlazas;
	}

	public void setNumPlazas(int numPlazas) {
		this.numPlazas = numPlazas;
	}
	
	
	
}
