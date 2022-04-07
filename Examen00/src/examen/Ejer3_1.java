package examen;

import java.util.ArrayList;

public class Ejer3_1 
{
     public static void main(String[] args)
     {
	  ArrayList<Shape> lista= new ArrayList<>();
     
         lista.add(new Rectangle(10, 20));
         lista.add(new Circle(9));
         lista.add(new Rectangle( 1, 6) );
         lista.add(new Square(4));
        
	// en esta zona se calcula la figura de la colecci�n que posee mayor �rea

	// el valor candidato es -1
       double candidata= -1;
         
       for (Shape elem : lista) 
       {
        	 if (elem.getArea() >  candidata)
        	 {	// cambia el valor del �rea candidata
        		candidata = elem.getArea();
        	 }
        	
	}
     
      System.out.println("El area m�xima es: " + candidata );      
    }
}