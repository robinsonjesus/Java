package core;

import java.io.*;
import java.util.Scanner;
 
class StringReverser {
    public static void main (String[] args) {
    	
      Scanner myObj = new Scanner(System.in);  // Create a Scanner object
      System.out.println("Enter the word you want to reverse: o");

      String wordtoreverse = myObj.nextLine();  // Read user input
       
      String str = wordtoreverse, nstr="";
      char ch;
       
      System.out.print("Original word: ");
      System.out.println(wordtoreverse); //Example word
       
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); //extracts each character
        nstr= ch + nstr; //adds each character in front of the existing string
      }
      System.out.println("Reversed word: " + nstr);
    }
}
