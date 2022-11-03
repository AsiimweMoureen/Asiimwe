package Ashton;

import java.util.Scanner;

public class Morgan {
	public static void main(String[] args) {
	// PRINTING
		System.out.println("Hi");
		System.out.print("Everyone");
		System.out.println("!");
	

	// VARIABLES

 String name = "Moureen";  //strings are objects not primitive
 char testGrade = 'A';     //single 16-bit Unicode character.
 
 name = "Asiimwe";
 
 System.out.println("My name is " + name);
 
 // STRINGS
 
 String greeting ="Good morning";
 
 System.out.println( greeting.length() ); 
 
 System.out.println( greeting.charAt(0) ); 
 
 System.out.println( greeting.indexOf("ing") ); 
 
 System.out.println( greeting.indexOf("z") ); 
 
 System.out.println( greeting.substring(2) ); 
 
 System.out.println( greeting.substring(1,4)); 
 
 // NUMBERS
 
 System.out.println(2*2);
 
 System.out.println(9%3);
 
 System.out.println((2+2)*3);
 
 System.out.println(9/3.0);
 
 int num = 20;
 num += 200;
 System.out.println(num);
 
 num++;
 System.out.println(num);
 
 System.out.println(Math.pow(2,3));
 
 System.out.println(Math.sqrt(81));
 
 System.out.println(Math.round(2.7));
 
 //USER INPUT
 
 Scanner keyboardInput = new Scanner(System.in);
 
 System.out.print("Enter username:");
 
 String username = keyboardInput.nextLine();
 
 System.out.println("Whatsup,"+ username);
 
 //ARRAYS
 
 int [] luckyNumbers = {1,2,3,4,5,6};
 
 luckyNumbers[0] = 100;
 System.out.println(luckyNumbers[0]);
 System.out.println(luckyNumbers[1]);
 System.out.println(luckyNumbers.length);
 
 
 
 
		 }
}