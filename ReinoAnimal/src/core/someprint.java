package core;

public class someprint {
	public static void main(String[] args) 
	{
		Mascota m1= new Gato("A", "at?n");
		Mascota m2=new Perro("B");
		Mascota m3 = new Gato("C");
		
		// Mascota m4= new Gato("C", "mocos");
		
		Leon s1= new Leon();

		System.out.println( m1 );
		System.out.println( m2 );
		System.out.println( s1 );
		// System.out.println( m4 );
	}
}
