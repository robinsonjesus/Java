package core;

public class Leon extends Salvaje{
	
	public Leon() {
		
		super("carne");
		
	}
	
	public String toString() {
		
		return 
				("Soy un le�n, no tengo owner y " 
				+ super.toString());
		
	}

}
