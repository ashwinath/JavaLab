// File: Number2DigitsLF.java
// Purpose: print a number one digit at a time (reverse order)
// Author: Ashwin Nath Chatterji
// Date: 01-02-2016

public class Number2DigitsLF {
  public static void main (String[] args) {
    int number = 2007;
    System.out.println("Integer " + number);
    while (number != 0) {
      System.out.println(number % 10);
      number /= 10;
    } 
  }
}
