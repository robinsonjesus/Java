package Clase02;

public class Perro extends Mascota{
	
	public Perro(String owner) {
		
		super(owner, "doggy");  // recibo un sólo parámetro de perro, pero devuelvo dos
		
		if (owner == null) // la comparación en Java es con ==
			throw new RuntimeException ("Lanzamos la excepción porque no seteaste owner");
		
		// super(); // aunque yo no indique el super(), el compilador sólo lo está indicando
		// cuando pongo super estoy llamando el constructor de arriba
		
		// predilecta = "dog chow"; becaues is private, I can't call it
		
		// System.out.println(owner);
	}
	/*
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Soy un perro, mi comida predilecta es "
				+ getPredilecta()
				+ " y mi owner es "
				+ getOwner();
		
	}
	*/
	@Override
	public String toString() {
		
		// uso el método super para llamar el toString de arriba, osea mascota.
		
		return "Soy un perro y " + super.toString();
		
	}


}
