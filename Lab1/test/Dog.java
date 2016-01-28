import java.util.Scanner;
import java.util.InputMismatchException;

public class Dog {
  private String gender;
  private int dogAge;
  private double humanAge;
  private Scanner scanner = new Scanner(System.in);

  public Dog() {
  }

  public void printAge() {
    if (gender.equals("male")) {
      System.out.print("His age in human years is ");
    } else {
      System.out.print("Her age in human years is ");
    }

    humanAge = dogToHumanAge();
    System.out.println(humanAge + ".");
  }

  private double dogToHumanAge() {
    if (dogAge <= 2)
      return 10.5 * (double) dogAge;
    else
      return 10.5 * 2 + (double) (dogAge - 2) * 4.0;
  }

  public int getAge() {
    dogAge = scanner.nextInt();
    if (dogAge < 0)
      throw new InputMismatchException();
    return dogAge;
  }

  public String getGender() {
    gender = scanner.next();
    if (!gender.equals("male") && 
        !gender.equals("female"))
      throw new InputMismatchException();
    return gender;
  }
  
  public void closeScanner() {
    scanner.close();
  }
}
