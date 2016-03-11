// File: LabSix.java
// Purpose: Arrays
// Author: Ashwin Nath Chatterji
// Date: 08-03-2016

import java.util.Scanner;

public class LabSix {
  private static Scanner scanner = new Scanner(System.in);

  public static void initialize(int[] ar) {
    ar[0] = 1;
    System.out.print("Please insert integer (1/10): ");
    ar[1] = scanner.nextInt();
    for (int i = 1; i < 10; ++i) {
      System.out.print("Please insert integer (" + (i+1) + "/10): ");
      int n = scanner.nextInt();
      insert(ar, n);
    }
    display(ar);
  }
  
  public static void insert(int[] ar, int n) {
    if (ar[0] == 10) {
      System.out.println("Array is full.");
      display(ar);
      return;
    }
    for (int i = ar[0]; i > 0; --i) {
      if (n > ar[i]) {
        ar[i+1] = n;
        ++(ar[0]);
        break;
      }
      ar[i+1] = ar[i];
      if (n > ar[i-1] || i == 1) {
        ar[i] = n;
        ++(ar[0]);
        break;
      }
    }
  }

  public static void remove(int[] ar, int n) {
    int i = 1;
    for (; i < ar[0]; ++i) {
      System.out.println("i = " + i + ", ar[0] = " + ar[0] + ", ar[i] = " + ar[i]);
      if (ar[i] == n) {
        break; // found it!
      }
    }
    if (ar[i] != n) {
      System.out.println("number not found");
      return;
    }
    while (i < ar[0]) {
      ar[i] = ar[i+1];
      i++;
    }
    --(ar[0]);
  }

  public static void display(int[] ar) {
    System.out.println("Current Array: ");
    for (int i = 1; i <= ar[0]; ++i) {
      System.out.print(ar[i] + " ");
    }
    System.out.println();
  }

  public static void main (String[] args) {
    int choice;
    int n;
    int[] array = new int[11];

    do {
      System.out.println("Perform the following methods:");
      System.out.println("1: intiialise");
      System.out.println("2: insert");
      System.out.println("3: remove");
      System.out.println("4: display");
      System.out.println("5: quit");
      System.out.print("Choice: ");
      choice = scanner.nextInt();
      switch (choice) {
        case 1:
          /* add initialize(array) call */
          initialize(array);
          break;
        case 2:
          /* add insert() call */
          System.out.print("Please type in an integer to insert: ");
          n = scanner.nextInt();
          insert(array, n);
          display(array);
          break;
        case 3:
          /* add remove() call */
          System.out.print("Please type in an integer to remove: ");
          n = scanner.nextInt();
          remove(array, n);
          display(array);
          break;
        case 4:
          /* add display() call */
          display(array);
          break;
        case 5:
          System.out.println("Programme terminating");
          break;
        default:
          System.out.println("Sorry did not recognise the command.");
      }
    } while (choice !=5);
    scanner.close();
  }
}
