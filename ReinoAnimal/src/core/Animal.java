package core;

abstract public class Animal {
	
	String predilecta;
	
	public Animal(String aComida)
	{
		predilecta= aComida;
	}
	
	public String toString()
	{
		return (" y mi comida predilecta es " + predilecta);
	}
}
