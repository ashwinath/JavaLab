// File: Account.java
// Purpose: Account class
// Author: Ashwin Nath Chatterji
// Date: 12-03-2016

import java.util.Date;

public class Account {
  private int id = 0;
  private double balance = 0.0;
  private double annualInterestRate = 0.0;
  private Date dateCreated;

  public Account() {
    this.dateCreated = new Date();
  }

  public Account(int id, double balance) {
    this.dateCreated = new Date();
    this.id = id;
    this.balance = balance;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }
  
  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public double getAnnualInterestRate() {
    return annualInterestRate;
  }

  public void setAnnualInterestRate(double annualInterestRate) {
    this.annualInterestRate = annualInterestRate;
  }

  public String getDateCreated() {
    return dateCreated.toString();
  }

  public double getMonthlyInterestRate() {
    return annualInterestRate/12.0;
  }

  public void withdraw(double amount) {
    if (amount > balance) {
      System.out.println("Sorry you do not have enough money. Transaction failed.");
      return;
    }
    balance -= amount;
  }

  public void deposit(double amount) {
    balance += amount;
  }
}
