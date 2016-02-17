// File: P2.java
// Purpose: generate tables of currency conversions from sg to us dollar
// Author: Ashwin Nath Chatterji
// Date: 17-2-2016

import java.util.Scanner;

public class P2 {
  public static void main (String[] args) {
    double start, end, inc;
    Scanner scanner = new Scanner(System.in);
    System.out.print("Start value: ");
    start = scanner.nextDouble();
    System.out.print("End value: ");
    end = scanner.nextDouble();
    System.out.print("Increment: ");
    inc = scanner.nextDouble();
    if (start > end) {
      System.out.println("error");
      return;
    } 
    System.out.println("US$\t\t\tS$");
    do {
      System.out.println(start + "\t\t\t" + start * 1.82);
      start += inc;
    } while (start <= end);
  }
}
