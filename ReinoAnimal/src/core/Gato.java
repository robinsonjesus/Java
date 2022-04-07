package core;

public class Gato extends Mascota 
{

	public Gato(String anOwner) 
	{
		super(anOwner, "Whiskas");
	}
	
	
	public Gato(String anOwner, String comida) 
	{
		super(anOwner, comida);
	}
	
	
	// método tostring()
	
	public String toString() {
		
		return ("Soy Gato y " + super.toString());
		
	}
	
}