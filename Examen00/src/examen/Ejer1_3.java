package examen;


import java.util.ArrayList;

public class Ejer1_3 
{
     public static void main(String[] args)      {
         
         ArrayList<Shape> lista= new ArrayList<>();
     
         lista.add(new Rectangle(10, 20));
         lista.add(new Circle(5));
         lista.add(new Rectangle( 1, 6) );
         lista.add(new Square(4));
        
         for ( Shape  elem : lista) 
   {
        	 System.out.println( elem ); 
	   }
   
    }
}