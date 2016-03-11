// File: TestAccountApp.java
// Purpose: test the Account class
// Author: Ashwin Nath Chatterji
// Date: 12-03-2016

public class TestAccountApp {
  public static void main (String[] args) {
    Account account = new Account(1122, 20000.0);
    account.setAnnualInterestRate(4.5);
    account.withdraw(2500.0);
    account.deposit(3000.0);
    double balance = account.getBalance();
    double monthlyInterest = account.getMonthlyInterestRate();
    String date = account.getDateCreated();
    System.out.println("Account Balance: $" + balance);
    System.out.println("Monthly Interest: " + monthlyInterest + "%");
    System.out.println("Date Created: " + date);
  }
}
