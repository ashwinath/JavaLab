// File: Payroll.java
// Purpose: generate payroll statement
// Author: Ashwin Nath Chatterji
// Date: 02-02-2016

import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import java.lang.Double;

public class Payroll {
  public class Employee {
    private String name;
    private double hours;
    private double payRate;
    private double federalTaxRate;
    private double stateTaxRate;

    public Employee(String name, double hours, double payRate, 
        double federalTaxRate, double stateTaxRate) {
      this.name = name;
      this.hours = hours;
      this.payRate = payRate;
      this.federalTaxRate = federalTaxRate;
      this.stateTaxRate = stateTaxRate;
    }

    private double genFederalTax(double pay, double federalTaxRate) {
      return pay * federalTaxRate;
    }

    private double genStateTax(double pay, double stateTaxRate) {
      return pay * stateTaxRate;
    }

    public String generateReportString() {
      double pay = this.hours * this.payRate;
      double federalTax = genFederalTax(pay, this.federalTaxRate);
      double stateTax = genStateTax(pay, this.stateTaxRate);
      double totalTax = federalTax + stateTax;
      double netPay = pay - totalTax;

      // need to convert to 2 dp.
      DecimalFormat df = new DecimalFormat("#0.00");
      String federalTaxString = df.format(federalTax);
      String stateTaxString = df.format(stateTax);
      String totalTaxString = df.format(totalTax);
      String netPayString = df.format(netPay);

      String output;
      output = "Employee Name: " + this.name +"\n" +
        "Hours worked: " + this.hours + "\n" +
        "Pay Rate: $" + this.payRate + "\n" +
        "Gross Pay: $" + pay + "\n" +
        "Deductions:\n" +

        "      Federal Withholding (" + (this.federalTaxRate * 100) +
        "): $" + federalTaxString +

        "\n      State Withholding (" + (this.stateTaxRate * 100) +
        "): $" + stateTaxString +
        "\n      Total Deduction: " + totalTaxString +
        "\nNet pay: $" + netPayString;
      return output;
    }
  } 

  public static void main (String[] args) {
    Payroll payroll = new Payroll();

    // error testing can be done here.
    String name = JOptionPane.showInputDialog
      ("Enter employee's Name: ");
    double hours = Double.parseDouble(JOptionPane.showInputDialog
      ("Enter Number of hours worked in a week: "));
    double payRate = Double.parseDouble(JOptionPane.showInputDialog
      ("Enter hourly pay rate: "));
    double federalTax = Double.parseDouble(JOptionPane.showInputDialog
      ("Enter Federal tax withholding rate: "));
    double stateTax = Double.parseDouble(JOptionPane.showInputDialog
      ("Enter State tax withholding rate: "));

    Employee employee = payroll.new Employee(
        name, hours, payRate, federalTax, stateTax);
    JOptionPane.showMessageDialog(null, employee.generateReportString());
  }
}
