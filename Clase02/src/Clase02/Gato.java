package Clase02;

public class Gato extends Mascota {
	
	public Gato(String owner) {
		
		super(owner, "atún");
		
	}
	
	// Otro constructor con otra preferencia de predilecta
	
	public Gato(String owner, String comida) {
		
		super(owner, comida);
		
	}
	
	/*
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Soy un gato, mi comida predilecta es "
				+ getPredilecta()
				+ " y mi owner es "
				+ getOwner();
	}
	*/
	public String toString() {
		
		// uso el método super para llamar el toString de arriba, osea mascota.
		
		return "Soy un gato y " + super.toString();
	}
	
}
