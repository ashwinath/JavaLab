// File: P2.java
// Purpose: take input and convert to movie genres 
// Author: Ashwin Nath Chatterji
// Date: 07-02-2016

import java.util.Scanner;
public class P2 {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    char c = scanner.next().charAt(0);
    switch (c) {
      case 'a':
      case 'A': System.out.println("Action movie fan");
                break;
      case 'c':
      case 'C': System.out.println("Comedy movie fan");
                break;
      case 'D':
      case 'd': System.out.println("Drama movie fan");
                break;
      default: System.out.println("Invalid choice");
               break;
    }
  }
}
