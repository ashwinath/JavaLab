// File: FutureInvestmentValue.java
// Purpose: read investment amount, annual interest rate, number of years
// and displays out futureInvestmentValue
// Author: Ashwin Nath Chatterji
// Date: 01-02-2016

import java.util.Scanner;
import java.lang.NumberFormatException;
import java.lang.Double;
public class FutureInvestmentValue {
  private static Scanner scanner = new Scanner(System.in);

  private static double getUserAmount() {
    while (true) {
      try {
        System.out.print("Amount: ");
        String amountString = scanner.next();
        double amount = Double.parseDouble(amountString);
        return amount;
      } catch (NumberFormatException e) {
        System.out.println("Sorry not a valid number.");
        System.out.println("Please try again");
      }
    }
  }

  private static double getUserInterestRate() {
    while (true) {
      try {
        System.out.print("Annual Interest Rate (in %): ");
        String interestRateString = scanner.next();
        double interestRate = Double.parseDouble(interestRateString);
        return interestRate;
      } catch (NumberFormatException e) {
        System.out.println("Sorry not a valid number.");
        System.out.println("Please try again");
      }
    }
  }

  private static double getUserYears() {
    while (true) {
      try {
        System.out.print("Years: ");
        String yearsString = scanner.next();
        double years = Double.parseDouble(yearsString);
        return years;
      } catch (NumberFormatException e) {
        System.out.println("Sorry not a valid number.");
        System.out.println("Please try again");
      }
    }
  }

  public static void main (String[] args) {
    try {
      double amount = getUserAmount();
      double interestRate = getUserInterestRate();
      double years = getUserYears();
      double futureInvestmentValue = 
        amount * Math.pow((1.0 + interestRate/100.0/12.0), (years*12.0));
      System.out.printf("Compounded value: %.2f\n", futureInvestmentValue);
    } finally {
      scanner.close();
    }
  }
}
