// File    : P5.java
// Purpose : Calculate the inverse tangent of some value
//           by approximating with Taylor series
// Author  : Adamas Aqsa Fahreza (U1240055E)
// Date    : 17 February 2016

import java.util.Scanner;

public class P5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double x, sum;
		
		System.out.print("Input value of x: ");
		x = s.nextDouble();
		sum = 0;
		
		for (int i=0; i<10; i++) {
			sum += -(2*(i%2)-1) * Math.pow(x,2*i+1)/(2.0*i+1.0);
		}
		
		System.out.println("Sum of first 10 terms of the series is: " + sum);
	}
}