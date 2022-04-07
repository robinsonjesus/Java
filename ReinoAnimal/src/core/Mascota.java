package core;

abstract public class Mascota extends Animal {
	
	
	private  String owner;
	
	public Mascota(String myOwner, String myPredilecta)
	{
		super(myPredilecta);
		owner= myOwner;
	}
	
	
	public String toString()
	{
		return ("Mi Owner es " + owner + super.toString());
	}

}