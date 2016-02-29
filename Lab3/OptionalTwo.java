// File: OptionalTwo.java
// Purpose: guessing birthday
// Author: Ashwin Nath Chatterji
// Date: 10-02-2016

import java.util.Scanner;
import java.util.Vector;

public class OptionalTwo {
  public static void main (String[] args) {
    Vector<Integer> daysInMonth1 = new Vector<>();
    Vector<Integer> daysInMonth2 = new Vector<>();
    Vector<Integer> daysInMonth3 = new Vector<>();
    Vector<Integer> daysInMonth4 = new Vector<>();
    Vector<Integer> daysInMonth5 = new Vector<>();
    Scanner scanner = new Scanner(System.in);

    for (int i = 1; i <= 31; ++i) {
      if ((i&1) > 0) {
        daysInMonth1.add(i);
      } 
      if ((i&2) > 0) {
        daysInMonth2.add(i);
      } 
      if ((i&4) > 0) {
        daysInMonth3.add(i);
      } 
      if ((i&8) > 0) {
        daysInMonth4.add(i);
      } 
      if ((i&16) > 0) {
        daysInMonth5.add(i);
      }
    }

    int n = 0;
    for (int x : daysInMonth1) {
      System.out.print(x + " ");
      ++n;
      if (n % 4 == 0) {
        System.out.println();
      }
    }
    System.out.println();
    System.out.println("Is your birthday here? ");
    String answer = scanner.next();
    boolean status1 = false;
    if (answer.equals("yes")) {
      status1 = true;
    }

    n = 0;
    for (int x : daysInMonth2) {
      System.out.print(x + " ");
      ++n;
      if (n % 4 == 0) {
        System.out.println();
      }
    }
    System.out.println();
    System.out.println("Is your birthday here? ");
    answer = scanner.next();
    boolean status2 = false;
    if (answer.equals("yes")) {
      status2 = true;
    }
    
    n = 0;
    for (int x : daysInMonth3) {
      System.out.print(x + " ");
      ++n;
      if (n % 4 == 0) {
        System.out.println();
      }
    }
    System.out.println();
    System.out.println("Is your birthday here? ");
    answer = scanner.next();
    boolean status3 = false;
    if (answer.equals("yes")) {
      status3 = true;
    }

    n = 0;
    for (int x : daysInMonth4) {
      System.out.print(x + " ");
      ++n;
      if (n % 4 == 0) {
        System.out.println();
      }
    }
    System.out.println();
    System.out.println("Is your birthday here? ");
    answer = scanner.next();
    boolean status4 = false;
    if (answer.equals("yes")) {
      status4 = true;
    }

    n = 0;
    for (int x : daysInMonth5) {
      System.out.print(x + " ");
      ++n;
      if (n % 4 == 0) {
        System.out.println();
      }
    }
    System.out.println();
    System.out.println("Is your birthday here? ");
    answer = scanner.next();
    boolean status5 = false;
    if (answer.equals("yes")) {
      status5 = true;
    }

    int birthday = 0;
    if (status1) {
      birthday += daysInMonth1.firstElement();
    }
    if (status2) {
      birthday += daysInMonth2.firstElement();
    }
    if (status3) {
      birthday += daysInMonth3.firstElement();
    }
    if (status4) {
      birthday += daysInMonth4.firstElement();
    }
    if (status5) {
      birthday += daysInMonth5.firstElement();
    }
    System.out.println("your birthday is: " + birthday);
  }
}
