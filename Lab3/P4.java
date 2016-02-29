// File: P4.java
// Purpose: request hours and calculates pay, tax and net pay
// Author: Ashwin Nath Chatterji
// Date: 10-02-2016

import java.util.Scanner;
public class P4 {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter hours worked: ");
    double hours = scanner.nextDouble();

    // simple error handling
    if (hours > 168 || hours < 0) {
      System.out.println("error in input");
      return;
    } 

    double pay;
    if (hours <= 40) {
      pay = hours * 6.0;
    } else {
      pay = hours * 6.0 + (hours - 40) * 6.0 * 1.5;
    }

    // tax
    double tax;
    if (pay <= 1000) {
      tax = 0.1 * pay;
    } else if (pay <= 1500) {
      tax = 0.1 * 1000 + 0.2 * (pay - 1000);
    } else {
      tax = 0.1 * 1000 + 0.2 * 500 + 0.3 * (pay - 1500);
    }
    
    System.out.println("Gross pay: " + pay);
    System.out.println("Tax: " + tax);
    System.out.println("Net pay: "+ (pay-tax));
  }
}
