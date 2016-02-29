// File: P3.java
// Purpose: Salary Scheme
// Author: Ashwin Nath Chatterji
// Date: 10-02-2016

import java.util.Scanner;

public class P3 {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Insert Salary: ");
    double salary = scanner.nextDouble();
    System.out.print("Insert Merit Points: ");
    double merit = scanner.nextDouble();
    char grade;

    if (salary >= 799 && salary <= 899) {
      grade = 'A';
    } else if (salary >= 649 && salary <= 700) {
      grade = 'B';
    } else if (salary >= 500 && salary <= 600) {
      grade = 'C';
    } else if (salary > 600 && salary < 649) {
      if (merit < 10) {
        grade = 'C';
      } else {
        grade = 'B';
      }
    } else if (salary > 700 && salary < 799) {
      if (merit < 20) {
        grade = 'B';
      } else {
        grade = 'A';
      }
    } else {
      grade = 'e';
      System.out.println("I don't know where you belong!");
    }
    if (grade != 'e') {
      System.out.println("Salary: " + salary + ", Merit Points: " + 
          merit  + ", Grade: " + grade);
    }
  }
}
