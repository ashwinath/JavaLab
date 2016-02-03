// File: Optional.java
// Purpose: determine the number of days in a month
// Author: Ashwin Nath Chatterji
// Date: 02-02-2016

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
    Calendar calendar = optional.new Calendar(2, 2012);
    // just implement the GUI here
    System.out.println(calendar.getMonthString() + " 2012 has " + calendar.getDaysInMonth() + " days.");
    // second part of the qn
    // also needs a GUI
    int randomMonth = (int)(Math.random() * 11) + 1;
    Calendar calendar2 = optional.new Calendar(randomMonth);
    System.out.println(calendar2.getMonthString());
  }
}
