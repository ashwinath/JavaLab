// File: Lab5.java
// Purpose: illustrate methods
// Author: Ashwin Nath Chatterji
// Date: 26-02-2016

import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Stack;

public class Lab5 {
  private static Scanner scanner = new Scanner(System.in);

  public static void main (String[] args) {
    int choice;
    Scanner sc = new Scanner(System.in);

    do {
      System.out.println("Perform the following methods:");
      System.out.println("1: Multiplication test");
      System.out.println("2: Quotient using division by subtraction");
      System.out.println("3: Remainder using division by subtraction");
      System.out.println("4: Count the number of digits");
      System.out.println("5: Position of a digit");
      System.out.println("6: extract all odd digits");
      System.out.println("7: Quit");
      System.out.print("Choice: ");
      choice = sc.nextInt();
      System.out.println();
      int m,n,result;

      switch (choice) {
        case 1:
          mulTest();
          break;

        case 2:
          System.out.println("This function takes 2 arguments, m and n and divides them.");
          System.out.print("m: ");
          m = scanner.nextInt();
          System.out.print("n: ");
          n = scanner.nextInt();
          result = divide(m, n);
          System.out.printf("%d/%d = %d\n\n", m, n, result);
          break;

        case 3:
          System.out.println("This function takes 2 arguments, m and n and gets the modulo.");
          System.out.print("m: ");
          m = scanner.nextInt();
          System.out.print("n: ");
          n = scanner.nextInt();
          result = modulus(m, n);
          System.out.printf("%d %% %d = %d\n\n", m, n, result);
          break;

        case 4:
          System.out.println("This function counts the number of digits in a number.");
          System.out.print("n: ");
          n = scanner.nextInt();
          result = countDigits(n);
          if (result == -1) {
            System.out.println("Error, please give a positive number.\n");
          } else {
            System.out.printf("n: %d - count = %d\n\n", n, result);
          }
          break;

        case 5:
          System.out.println("This function finds the position of the digit in a number.");
          System.out.print("n: ");
          n = scanner.nextInt();
          System.out.print("digit: ");
          m = scanner.nextInt();
          result = position(n, m);
          if (result == -1) {
            System.out.println("Not found.\n");
          } else {
            System.out.printf("position = %d\n\n", result);
          }
          break;

        case 6:
          System.out.println("This function extracts all the odd digits from a number");
          System.out.print("n: ");
          long a = scanner.nextInt();
          long oddDigits = extractOddDigits(a);
          if (oddDigits == -1) {
            System.out.println("No odd digits.\n");
          } else {
            System.out.printf("oddDigits = %d\n\n", oddDigits);
          }
          break;

        case 7:
          System.out.println("Programme Terminating");
          return;
      }
    } while (choice < 7);
    sc.close();
    scanner.close();
  }

  private static int getRandom(int min, int max) {
    return (int) (Math.random() * ((max-min)+1)) + min;
  }

  public static void mulTest() {
    int correctCount = 0;
    for (int i = 0; i != 5; ++i) {
      int first = getRandom(1,9);
      int second = getRandom(1,9);
      System.out.printf("How much is %d times %d? ", first, second);
      int answer = scanner.nextInt();
      if (answer == first * second) {
        ++correctCount;
      }
    }
    System.out.printf("%d answers out of 5 are correct.\n\n", correctCount);
  }

  public static int divide(int m, int n) {
    int count = 0;
    while (m >= n) {
      m -= n;
      ++count;
    }
    return count;
  }

  public static int modulus(int m, int n) {
    return m - divide(m,n) * n;
  }

  public static int countDigits(int n) {
    int count = 0;

    if (n < 0) {
      return -1;
    }

    while (n > 0) {
      n /= 10;
      ++count;
    }
    return count;
  }

  public static int position(int n, int digit) {
    int currentDigit;
    int count = 1;
    while (n > 0) {
      currentDigit = n % 10;
      if (digit == currentDigit) {
        return count;
      }
      n /= 10;
      ++count;
    }
    return -1;
  }

  public static long extractOddDigits(long n) {
    long currentDigit;
    long oddDigits = 0;
    Stack<Long> stack = new Stack<>();
    while (n > 0) {
      currentDigit = n % 10;
      if (currentDigit % 2 == 1) {
        stack.push(currentDigit);
      }
      n /= 10;
    }

    if (stack.empty()) {
      return -1;
    }

    while (!stack.empty()) {
      oddDigits *= 10;
      oddDigits += stack.pop();
    }
    return oddDigits;
  }
}
