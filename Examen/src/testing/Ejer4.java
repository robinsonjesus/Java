package testing;

import MiPaquete.Fraction;

public class Ejer4 {
	
	public static void main(String[] args) {

		Fraction f1= new Fraction(7, 3);
		Fraction f2= new Fraction(8, 2);
		
		System.out.println( f1 );
		System.out.println( f2 );

		System.out.println( f1.product(f2) );
		System.out.println( f1.product(9) );
		
		Fraction ferror= new Fraction(8, 1);
		System.out.println( ferror );
	    System.out.println("todo OK");
	    
	    System.out.println(new Fraction(7));
		
	}
}