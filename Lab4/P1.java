// File: P1.java
// Purpose: read a character repeatedly
// Author: Ashwin Nath Chatterji
// Date: 17-2-2016

import java.util.Scanner;

public class P1 {
  public static boolean isVowel(char c) {
    String vowels = "aeiouAEIOU";
    return vowels.indexOf(c) == -1 ? false : true;
  }

  public static boolean isConsonant(char c) {
    String consonant = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
    return consonant.indexOf(c) == -1 ? false : true;
  }

  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    for(;;) {
      System.out.println("Please enter character");
      char c = scanner.next().charAt(0);
      if (c == '#') {
        System.out.println("Exiting Programme");
        break;
      } else if (isVowel(c)) {
        System.out.println("Vowel.");
      } else if (isConsonant(c)) {
        System.out.println("Consonant");
      } else if (Character.isDigit(c)) {
        System.out.println("Digit");
      } else {
        System.out.println("Neither");
      }
    }
  }
}
