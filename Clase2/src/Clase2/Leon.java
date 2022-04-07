package Clase2;

public class Leon extends Salvaje{
	
	public Leon(String getPredilecta) {
		
		super("Carne");
	}
	
	public String toString() {
		
		// uso el método super para llamar el toString de arriba, osea mascota.
		
		return "Soy un Leon y " + super.toString();
		
	}

}
