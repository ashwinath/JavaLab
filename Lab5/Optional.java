import java.util.Scanner;

public class Optional {
  private static int[] longToArray(String cardNumber) {
    int[] cardNumberArray = new int[cardNumber.length()];
    for (int i = 0; i < cardNumber.length(); ++i) {
      cardNumberArray[i] = cardNumber.charAt(i) - '0';
    }
    return cardNumberArray;
  }

  private static int sum2nDigits(int[] arr) {
    int total = 0;
    for (int i = arr.length - 2; i >= 0; i -= 2) {
      int temp = arr[i] * 2;
      if (temp > 9) {
        total += temp % 10 + (temp % 100 - temp %10)/10;
      } else {
        total += temp;
      }
    }
    
    for (int i = arr.length -1; i>= 0; i-=2) {
      total += arr[i];
    }
    return total;
  }
  
  public static boolean isValid(int[] cardNumberArray) {
    if (cardNumberArray.length < 13 || cardNumberArray.length > 16)
      return false;
    if (cardNumberArray[0] != 4 && cardNumberArray[0] != 5 &&
        cardNumberArray[0] != 6 &&
        (cardNumberArray[0] != 3 && cardNumberArray[1] != 7)) {
      return false;
    }
    return (sum2nDigits(cardNumberArray) % 10 == 0);
  }

  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Insert Credit Card Number: ");
    String cardNumber = scanner.next();
    int[] cardNumberArray = longToArray(cardNumber);
    if (isValid(cardNumberArray))
      System.out.println(cardNumber + " is valid");
    else
      System.out.println(cardNumber + " is invalid");
  }
}
