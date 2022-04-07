package testing;

import core.Fraction;
import core.FractionService;

public class Ejer47 {
	public static void main(String[] args) {

		Fraction f1= new Fraction(7, 3);
		Fraction f2= new Fraction(8, 2);
		Fraction f3= f1.product(f2);
		
		System.out.println( f1 );
		System.out.println( f2 );
		System.out.println( f3  );
		System.out.println( f3  );
		System.out.println( f1.product(9) );
		
		
		}
}