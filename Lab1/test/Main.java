import java.util.Scanner;
import java.util.InputMismatchException;
import java.lang.*;

public class Main {
  private static Scanner scanner = new Scanner(System.in);

  private static boolean hasDog() {
    // get hasDog information
    while (true) {
      try {
          System.out.print("Do you have dog(s)? (y/n) ");
          char hasDog = scanner.next().charAt(0);

          if (hasDog != 'y' && hasDog != 'n')
            throw new InputMismatchException();
          
          if (hasDog == 'n') {
            System.out.println(
                "That's too bad. We cannot serve you! See you.");
            scanner.close();
            return false;
          }
          return true;
      } catch (InputMismatchException e) {
        System.out.println("Please enter either 'y' or 'n'.");
      }
    }
  }

  private static int numberOfDogs() {
    while (true) {
      System.out.print("How many dogs do you have? ");
      String numberString = scanner.next();
      try {
        int number = Integer.parseInt(numberString);
        if (number < 0)
          throw new NumberFormatException();
        return number;
      } catch (NumberFormatException e) {
        System.out.println("Please enter a Number greater than 0, try again.");
      }
    }
  }

  private static int getAge(int i) {
    while (true) {
        System.out.print("What is the age of dog #" + (i+1) + "? ");
        String ageString = scanner.next();
      try {
        int age = Integer.parseInt(ageString);
        if (age < 0) {
          throw new NumberFormatException();
        }
        return age;
      } catch (NumberFormatException e) {
        System.out.println("Please enter an age of value 0 or above.");
      }
    }
  }

  private static String getGender() {
    while (true) {
      try {
        System.out.print("male or female? ");
        String gender = scanner.next();
        if (!gender.equals("male") && !gender.equals("female"))
          throw new InputMismatchException();
        return gender;
      } catch (InputMismatchException e) {
        System.out.println("Please enter \"male\" or \"female\"");
      }
    }
  }

  public static void main (String[] args) {
    // ask if user has dog(s)
    try {
      boolean boolDog = hasDog();
      if (!boolDog)
        return;

      // get numberOfDogs
      int number = numberOfDogs();

      // loop for the number of dogs
      Dog currentDog = new Dog();
      for (int i = 0; i < number; ++i) {
        currentDog.setAge(getAge(i));
        currentDog.setGender(getGender());
        currentDog.printAge();
      } 
    } finally {
      scanner.close();
    }
  }
}
