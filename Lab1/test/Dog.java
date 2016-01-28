public class Dog {
  private String gender;
  private int dogAge;
  private double humanAge;

  public Dog(String maleFemale, int age) {
    gender = maleFemale;
    dogAge = age;
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
    if (dogAge <= 2) {
      return 10.5 * (double) dogAge;
    } else {
      return 10.5 * 2 + (double) (dogAge - 2) * 4.0;
    }
  }
}
