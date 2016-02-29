// File: P5.java
// Purpose: get the year dnd display chinese zodiac
// Author: Ashwin Nath Chatterji
// Date: 10-02-2016

import javax.swing.JOptionPane;

public class P5 {
  public static void main (String[] args) {
    int year = Integer.parseInt(JOptionPane.showInputDialog("Which year are you born in?"));
    int sign = year % 12;
    String signStr;
    switch (sign) {
      case (0): signStr = "Monkey";
                break;
      case (1): signStr = "Rooster";
                break;
      case (2): signStr = "Dog";
                break;
      case (3): signStr = "Pig";
                break;
      case (4): signStr = "Rat";
                break;
      case (5): signStr = "Ox";
                break;
      case (6): signStr = "Tiger";
                break;
      case (7): signStr = "Rabbit";
                break;
      case (8): signStr = "Dragon";
                break;
      case (9): signStr = "Snake";
                break;
      case (10): signStr = "Horse";
                break;
      case (11): signStr = "Goat";
                break;
      default: signStr = "error.";
               break;
    }
    JOptionPane.showMessageDialog(null, signStr);
  }
}
