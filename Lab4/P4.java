// File    : P4.java
// Purpose : Print a certain pattern to a specified height
// Author  : Adamas Aqsa Fahreza (U1240055E)
// Date    : 17 February 2016

import java.util.Scanner;

public class P4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int h;
		
		System.out.print("Input height of pattern: ");
		h = s.nextInt();
		
		if (h<=0)
			System.out.println("Input error. Only input positive integers.");
		else
			for (int i=0; i<h; i++) {
				for (int j=0; j<(i+1); j++) {
					if ((i+j)%2==0)
						System.out.print("AA");
					else
						System.out.print("BB");
				}
				System.out.println("");
			}
	}
}