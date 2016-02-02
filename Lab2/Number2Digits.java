// File: Number2Digits.java
// Purpose: print each digit per line
// Author: Ashwin Nath Chatterji
// Date: 01-02-2016

import java.util.ArrayDeque;
import java.util.Deque;
import java.lang.Integer;
public class Number2Digits {
  public static void main (String[] args) {
    int number = 2007;
    // we make use of the LIFO properties of Stacks
    Deque<Integer> numberStack = new ArrayDeque<Integer>();
    System.out.println("Integer " + number);
    while (number != 0) {
      numberStack.push(number % 10);
      number /= 10;
    }

    while (!numberStack.isEmpty()) {
      System.out.println(numberStack.pop());
    }
  }
}
