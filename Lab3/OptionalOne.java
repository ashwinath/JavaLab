// File: OptionalOne.java
// Purpose: lottery game
// Author: Ashwin Nath Chatterji
// Date: 10-02-2016

import java.util.Scanner;

public class OptionalOne {
  public static void main (String[] args) {
    int msb = (int)(Math.random() * 10);
    int lsb = (int)(Math.random() * 10);

    Scanner scanner = new Scanner(System.in);
    System.out.print("Please enter 2 digits: ");
    int userNum = scanner.nextInt();
    if (userNum > 100 || userNum < 0) {
      System.out.println("error");
      return;
    } 

    int userLsb = userNum % 10;
    int userMsb = (userNum - userLsb) / 10;

    int status = 4;
    // 1 -> 1 similar correct order
    // 2 -> both similar
    // 3 -> wrong order but both similar
    // 4 -> both wrong

    if (lsb == userLsb) {
      status = 1;
    }

    if (msb == userMsb) {
      if (status == 1) {
        status = 2;
      } else {
        status = 1;
      }
    }

    if (msb == userLsb && lsb == userMsb) {
      status = 3;
    } else if (msb == userLsb || lsb == userMsb) {
      status = 1;
    }

    System.out.println("number was: " + msb + lsb);
    switch (status) {
      case (1) : System.out.println("You have won $1,000");
                 break;
      case (2) : System.out.println("You have won $3,000");
                 break;
      case (3) : System.out.println("You have won $10,000");
                 break;
      case (4) : System.out.println("Sorry you won nothing");
                 break;
      default: System.out.println("error");
               break;
    }
  }
}
