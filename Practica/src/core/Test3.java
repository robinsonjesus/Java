package core;

import java.awt.Color;
import java.util.*;


public class Test3 {

		public static void main(String[] args) 
		{
			TreeSet<String> lista= new TreeSet<String>();
			
			lista.add("examen");
			lista.add("nivelacion");  
			lista.add("algoritmos");
			lista.add("estructura de datos");
			
			for (String anElement : lista) {
				System.out.println(anElement.toString() + "\n");
			}
			
			lista.add("albania");
			lista.add("velero");
			
			for (String anElement : lista) {
				System.out.println(anElement.toString());

		}
		/* 
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
			
			*/
}
}