package core;

public class Perro extends Mascota {
	
	public Perro(String anOwner) 
	
	{
		super(anOwner, "Doggy");
	}
	
	public String toString() {
			
			return ("Soy perro y " + super.toString());
			
		}
}