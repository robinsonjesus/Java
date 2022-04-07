package Clase02;

public abstract class Animal { // abstract class no permite instanciar la clase
	
	private String predilecta;
	
	public String getPredilecta() {
		
		return predilecta;  // Variable de instancia, porque la instanciamos en cada subclase
			
	}
	
	public Animal(String parametroPredilecta) {
		
		predilecta = parametroPredilecta;
		
// 		System.out.println("Soy un Animal");
		
	}
	
	@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "mi comida predilecta es " + predilecta; // Tambi�n puedo invocar getPredilecta el m�todo, porque ac� si puedo acceder
		}

}
