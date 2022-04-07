package Clase02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class testClase04 {
	public static void main(String[] args) {
		
		int[] nros;
		
		nros = new int[3];
		
		nros[0] = 40;
		nros[1] = 25;
		nros[2] = 15;
		
		System.out.println(nros + "\n");
		
		// for
		
		for(int rec=0; rec <= 2; rec++) {
			
			System.out.println(nros[rec] + "\n");
			
		}
		
		// foreach
		
		for(int i : nros) {
			
			System.out.println( i + "\n" );
			
		}
		
		ArrayList<Integer> nros2 = new ArrayList<>();
		
		nros2.add(40);
		nros2.add(25);
		nros2.add(15);
		
		System.out.println();
		Collections.sort(nros2);
		
		for (Integer i : nros2) {	
			System.out.println(i);
			
		}
		
		ArrayList<String> plbr = new ArrayList<>();
		
		plbr.add("ac");
		plbr.add("ab");
		plbr.add("hj");
		plbr.add("aa");
		
		System.out.println();
		Collections.sort(plbr);
		
		for (String i : plbr) {
			
			System.out.println(i);
			
		}
		
		TreeSet<Integer> nros3 = new TreeSet<>();
		
		nros3.add(40);
		nros3.add(25);
		nros3.add(15);
		
		System.out.println();
		// Collections.sort(nros2);
		
		for (Integer i : nros3) {	
			System.out.println(i);
			
		}
		
	}
}
