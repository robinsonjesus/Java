package Clase02;

public abstract class Mascota extends Animal {
	
	private String owner;
	
	public String getOwner() {
		
		return owner;
		
	}
	
	public Mascota(String owner, String parametroPredilecta) { // owner puede tene cualquier nombre, sólo existe aquí. le llamo owner por comodidad
		
		super(parametroPredilecta); // super debe ir sí o sí en la primera línea
		
		this.owner = owner;
		
		
		// 		System.out.println("Soy una Mascota");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Mi owner es " + getOwner() + " y " + super.toString();
	}
	
}
