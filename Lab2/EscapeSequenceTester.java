// File: EscapeSequenceTester.java
// Purpose: Print a certain format with the use of escape sequences
// Author: Ashwin Nath Chatterji
// Date: 01-02-2016

public class EscapeSequenceTester {
  private static String formatString(String person, 
      String height, String size) {
    return String.format("%s\t\t%s\t\t%s", person, height, size);
  }

  public static void main (String[] args) {
    String title = formatString("Person", "Height", "Shoe Size");
    String hannah = formatString("Hannah", "5\'1\"", "7");
    String jenna = formatString("Jenna", "5\'10\"", "9");
    System.out.println(title);
    System.out.println("=========================================");
    System.out.println(hannah);
    System.out.println(jenna);
  }
}
