package Clase02;

public class Leon extends Salvaje{
	
	public Leon() {
		
		super("carne");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Soy un Le�n, mi comida predilecta es "
				+ getPredilecta();
	}

}
