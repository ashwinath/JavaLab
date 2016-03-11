// File: DiceApp.java
// Purpose: test the Dice class
// Author: Ashwin Nath Chatterji
// Date: 11-03-2016

public class DiceApp {
  public static void main (String[] args) {
    Dice dice = new Dice();
    dice.printDiceValue();
    int diceValue = dice.getDiceValue();
    System.out.println("Dice value using getDiceValue method is " + diceValue);

    //randomise again
    dice.setDiceValue();
    dice.printDiceValue();
    diceValue = dice.getDiceValue();
    System.out.println("Dice value using getDiceValue method is " + diceValue);
  }
}
