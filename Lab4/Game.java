// File: Game.java
// Purpose: Rock-Paper-Scissors game
// Author: Ashwin Nath Chatterji
// Date: 15-02-2016

import java.util.Scanner;

public class Game {
  private static String getElement(int choice) {
    switch (choice) {
      case (0) : return "Scissors";
      case (1) : return "Rock";
      case (2) : return "Paper";
      default: return "Error";
    }
  }

  private static void playGame(int choice) {
    // 0 = Scissors
    // 1 = rock
    // 2 = paper
    int computerChoice = (int)(Math.random() * 3);
 
    // 0 = user loses
    // 1 = user wins
    // 2 = draw
    // 3 = error
    int userWin = 0;

    if (computerChoice == choice) {
      userWin = 2;
    } else if (computerChoice == 0) {
      if (choice == 1)
        userWin = 1;
    } else if (computerChoice == 1) {
      if (choice == 2)
        userWin = 1;
    } else if (computerChoice == 2) {
      if (choice == 0)
        userWin = 1;
    } else {
      userWin = 3;
    }

    System.out.print("Computer is a " + getElement(computerChoice) + ".---");

    switch (userWin) {
      case (0) : System.out.println("You lose"); break;
      case (1) : System.out.println("You win"); break;
      case (2) : System.out.println("It's a draw"); break;
      case (3) : System.out.println("Error in input"); break;
      default : break;
    }
  }
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    for(;;) {
      System.out.print("Scissors (0), Rock (1), Paper (2), Exit(666): ");
      int choice = scanner.nextInt();
      if (choice == 666)
        break;
      playGame(choice);
    }
  }
}
