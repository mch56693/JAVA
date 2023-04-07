package Coche;

public class Taxi extends Vehiculo{
	
	private int numLicencia;

	public Taxi(String matricula, String modelo, String potenciaCV, int numLicencia) {
		
		super(matricula, modelo, potenciaCV);
		
		this.numLicencia = numLicencia;
		
	}

	public int getNumLicencia() {
		return numLicencia;
	}

	public void setNumLicencia(int numLicencia) {
		this.numLicencia = numLicencia;
	}
	
}
