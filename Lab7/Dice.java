// File: Dice.java
// Purpose: Dice class
// Author: Ashwin Nath Chatterji
// Date: 11-03-2016

public class Dice {
  private int valueOfDice;

  public Dice() {
    setDiceValue();
  }

  public void setDiceValue() {
    valueOfDice = (int) (Math.random() * 6 +1);
  }

  public int getDiceValue() {
    return valueOfDice;
  }

  public void printDiceValue() {
    System.out.println("Dice value is " + valueOfDice);
  }
}
