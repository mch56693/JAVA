package Coche;

public class Vehiculo {

	private String matricula;
	private String modelo;
	private String potenciaCV;
	
public Vehiculo(String matricula, String modelo, String potenciaCV) 
	{
		setMatricula(matricula);
		setModelo(modelo);
		setPotenciaCV(potenciaCV);
	}

	//SETTERS & GETTERS
	public String getMatricula() {
	return matricula;
}
	public void setMatricula(String matricula) {
	this.matricula = matricula;
}

	public String getModelo() {
	return modelo;
}
	public void setModelo(String modelo) {
	this.modelo = modelo;
}

	public String getPotenciaCV() {
	return potenciaCV;
}
	public void setPotenciaCV(String potenciaCV) {
	this.potenciaCV = potenciaCV;
}

@Override
public String toString() {
	return "Matricula: " + getMatricula() + "\n" + getModelo() + "Modelo: " + getModelo() + "\n" + "PotenciaCV" + getPotenciaCV() + "\n";
	}
}
