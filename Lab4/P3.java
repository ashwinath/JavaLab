// File    : P3.java
// Purpose : Print a certain pattern to a specified size
//           using a specified character
// Author  : Adamas Aqsa Fahreza (U1240055E)
// Date    : 17 February 2016

import java.util.Scanner;

public class P3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int h;
		char c;
		
		System.out.print("Input size of pattern: ");
		h = s.nextInt();
		
		if (h<=0)
			System.out.println("Input error. Only input positive integers.");
		else {
			System.out.print("Input character to be used in pattern: ");
			c = s.next(".").charAt(0);
			
			for (int i=0; i<h; i++) {
				for (int j=0; j<h; j++)
					System.out.print(c);
				System.out.println("");
			}
		}
	}
}