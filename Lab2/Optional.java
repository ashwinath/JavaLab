// File: Optional.java
// Purpose: determine the number of days in a month
// Author: Ashwin Nath Chatterji
// Date: 02-02-2016

import javax.swing.JOptionPane;
import java.lang.Integer;

public class Optional {
  public class Calendar {
    int month;
    int year;

    public Calendar(int month) {
      this.month = month;
    }

    public Calendar(int month, int year) {
      this.month = month;
      this.year = year;
    }

    private boolean isLeapYear() {
      if (year % 4 == 0) {
        if (year % 100 == 0) {
          if (year % 400 == 0) {
            return true;
          }
          return false;
        }
        return true;
      }
      return false;
    }

    public String getMonthString() {
      switch (month) {
        case (1): return "January";
        case (2): return "February";
        case (3): return "March";
        case (4): return "April";
        case (5): return "May";
        case (6): return "June";
        case (7): return "July";
        case (8): return "August";
        case (9): return "September";
        case (10): return "October";
        case (11): return "November";
        case (12): return "December";
        default: return "invalid month";
      }
    }

    public int getDaysInMonth() {
      switch (month) {
        case (1): return 31;
        case (2): return isLeapYear() ? 29 : 28;
        case (3): return 31;
        case (4): return 30;
        case (5): return 31;
        case (6): return 30;
        case (7): return 31;
        case (8): return 31;
        case (9): return 30;
        case (10): return 31;
        case (11): return 30;
        case (12): return 31;
        default: return -1;
      }
    }
  } 

  public static void main (String[] args) {
    Optional optional = new Optional();

    // part 1
    int month = Integer.parseInt(JOptionPane.showInputDialog
        ("Enter Month (numerical)"));
    int year = Integer.parseInt(JOptionPane.showInputDialog
        ("Enter Year (numerical)"));
    Calendar calendar = optional.new Calendar(month, year);
    JOptionPane.showMessageDialog(null, calendar.getMonthString() +
        " " + year + 
        " has " + calendar.getDaysInMonth() + " days.");
    // part 2
    int randomMonth = (int)(Math.random() * 11) + 1;
    Calendar calendar2 = optional.new Calendar(randomMonth);
    JOptionPane.showMessageDialog(null, "Random month: " + 
         randomMonth + "\nrandomMonth has the name: " +
         calendar2.getMonthString());
  }
}
