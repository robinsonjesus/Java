package examen;

import java.util.ArrayList;

public class Ejer3_2 
{
     public static void main(String[] args)
     {
	  ArrayList<Shape> lista= new ArrayList<>();
     
   lista.add(new Rectangle(10, 20));
         lista.add(new Circle(9));
         lista.add(new Rectangle( 1, 6) );
         lista.add(new Square(4));
        
	// en esta zona se calcula la figura de la colecci�n que posee menor �rea

       double candidata= Integer.MAX_VALUE;
         
       for (Shape elem : lista) 
       {
        	 if (elem.getArea() <  candidata)
        	 {	// cambia el valor del �rea candidata
        		candidata = elem.getArea();
        	 }
        	
	}
     
      System.out.println("El area m�nima es: " + candidata );
      
     }
}