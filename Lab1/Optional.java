// File:    Five.java
// Purpose: Changes dog years to human years
// Author:  Ashwin Nath Chatterji
// Date:    27/01/2016
import java.util.Scanner;
import java.util.InputMismatchException;
public class Optional {
  public static void main (String[] args) {
    // Construct Scanner class
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Do you have dogs (y/n)? ");
    try {
      char yesNo = scanner.next(".").charAt(0);
      if (yesNo != 'n' && yesNo != 'y') {
        throw new InputMismatchException();
      }
      if (yesNo == 'n') {
        System.out.println("That is too bad. We cannot serve you! See you.");
      } else {
        System.out.print("How many dogs do you have? ");
        int numberOfDogs = scanner.nextInt();
        if (numberOfDogs == 0) {
          System.out.println("YOU LIE!!!");
          throw new InputMismatchException();
        } else if (numberOfDogs < 0) {
          throw new InputMismatchException();
        }
        for (int i = 0; i != numberOfDogs; ++i ) {
          System.out.print("How old is dog #" + (i+1) + ": ");
          int age = scanner.nextInt();
          if (age < 0) {
            throw new InputMismatchException();
          }
          System.out.print("male or female? ");
          String gender = scanner.next();

          if (!gender.equals("male") && !gender.equals("female")) {
            throw new InputMismatchException();
          } else if (gender.equals("male")) {
            System.out.print("His age in human years is ");
          } else {
            System.out.print("Her age in human years is ");
          }

          // get dog years
          double humanAge;
          if (age > 2) {
            humanAge = 2 * 10.5 + 4 * (double)(age - 2);
          } else {
            humanAge = (double)age * 10.5;
          }
          System.out.println(humanAge);
        }
      }
    } catch (InputMismatchException e) {
      System.out.println("Invalid Input.");
    } finally {
      scanner.close();
    }
  }
}
