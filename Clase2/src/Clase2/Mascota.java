package Clase2;

abstract public class Mascota extends Animal {
	
	private  String owner;
	
	public Mascota(String anOwner, String aPredilecta)
	{
		super(aPredilecta);
		owner= anOwner;
	}
	
	public String getOwner()
	{
		return owner;
	}
	
	public String toString() {
		
		// uso el m�todo super para llamar el toString de arriba, osea mascota.
		
		return "Mi due�o es" + super.toString();
	}
}