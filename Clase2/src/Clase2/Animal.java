package Clase2;

abstract public class Animal {
	private String predilecta;
	
	public Animal(String aComida)
	{
		predilecta = aComida;
	}
	
	public String getPredilecta()
	{
		return predilecta;
	}
}