// File: TestDouble.java
// Purpose: better understand the properties of double
// Author: Ashwin Nath Chatterji
// Date: 01-02-2016

public class TestDouble {
  public static void main (String[] args) {
    // to understand why this happens
    double partOne = (1.0/3.0 + 1.0/4.0) * 12.0;
    System.out.println("(1/3 + 1/4) * 12 = " + partOne);

    // for 0.1 x10
    // 0.1 in binary is 0.001100110011... recurring 0011
    // same idea as for humans in decimal form
    // 1/3 = 0.33333... recurring 3
    // 1/3 + 1/3 + 1/3 is 0.99999999... recurring 9
    // ergo, for computers to add recurring digits, its sum is
    // 0.001100110011... x 1010
    // since double has only a precision of up to 64 bits
    // value gets truncated and it gives a value of close to 10 in decimal
    double partTwo = 0.0;
    for (int i = 0; i != 10; ++i) {
      partTwo += 0.1;
    }
    System.out.println("Add 0.1 up 10 times = " + partTwo);
  }
}
