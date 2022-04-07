package core;

import java.awt.Color;
import java.util.*;


public class Test1 {

	public static void main(String[] args) 
	{
		ArrayList<String> lista= new ArrayList<String>();
		
		lista.add("examen");
		lista.add("nivelacion");  
		lista.add("algoritmos");
		lista.add("estructura de datos");
		
		for (String anElement : lista) {
			System.out.println(anElement.toString());
		}
		
	}
	
}