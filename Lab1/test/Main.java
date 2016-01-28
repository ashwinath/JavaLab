import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
  public static void main (String[] args) {
    System.out.print("Do you have dogs? (y/n) ");
    Scanner scanner = new Scanner(System.in);
    Dog currentDog = new Dog();

    try {
      char yesNo = scanner.next(".").charAt(0);
      if (yesNo != 'y' && yesNo != 'n')
        throw new InputMismatchException();
      if (yesNo == 'n') {
        System.out.println("That's too bad, we are unable to serve you.");
      } else {
        System.out.print("How many dogs do you have? ");
        int numberOfDogs = scanner.nextInt();

        if (numberOfDogs == 0) {
          System.out.println("YOU LIE!!");
          throw new InputMismatchException();
        } else if (numberOfDogs < 0) {
          throw new InputMismatchException();
        }

        for (int i = 0; i < numberOfDogs; ++i) {

          System.out.print("How old is dog #" + (i+1) + "? ");
          int dogAge = currentDog.getAge();

          System.out.print("male or female? ");
          String gender = currentDog.getGender();

          currentDog.printAge();
        }
      }
    } catch (InputMismatchException e) {
      System.out.println("Error in input");
    } finally {
      currentDog.closeScanner();
      scanner.close();
    }
  }
}
