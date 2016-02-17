// File: DisplayCalendars.java
// Purpose: Generate months of a calendar
// Author: Ashwin Nath Chatterji
// Date: 14-02-2016

import java.util.Scanner;

public class DisplayCalendars {
  public class Calendar {
    // sunday is 0, wed is 3 and sun is 6; i.e 0-6
    private int startDay;
    private int year;

    public Calendar(int startDay, int year) {
      this.startDay = startDay;
      this.year = year;
    }

    private boolean isLeapYear() {
      return ((this.year % 4 == 0) && (this.year % 100 != 0) || (this.year % 400 == 0));
    }

    private int getDaysInMonth(int month) {
      switch (month) {
        case (1) : return 31;
        case (2) : return isLeapYear() ? 29 : 28;
        case (3) : return 31;
        case (4) : return 30;
        case (5) : return 31;
        case (6) : return 30;
        case (7) : return 31;
        case (8) : return 31;
        case (9) : return 30;
        case (10) : return 31;
        case (11) : return 30;
        case (12) : return 31;
        default: return -1;
      }
    }

    private String getMonthName(int month) {
      String monthName;
      switch (month) {
        case (1) : monthName = "January"; break;
        case (2) : monthName = "February"; break;
        case (3) : monthName = "March"; break;
        case (4) : monthName = "April"; break;
        case (5) : monthName = "May"; break;
        case (6) : monthName = "June"; break;
        case (7) : monthName = "July"; break;
        case (8) : monthName = "August"; break;
        case (9) : monthName = "September"; break;
        case (10) : monthName = "October"; break;
        case (11) : monthName = "November"; break;
        case (12) : monthName = "December"; break;
        default: monthName = "Error"; break;
      }
      return monthName;
    }

    private void printCalendarHeader(int month) {
      String monthName = getMonthName(month);
      System.out.println("          " + monthName + " " + this.year);
      System.out.println("-----------------------------");
      System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
    }

    private void generateMonth(int month) {
      // do something
      int count = 1;
      int daysInLine = 0;

      // skip initial days first
      for (; daysInLine != this.startDay; ++daysInLine) {
        System.out.print("    ");
      }

      // print the numbers on the calendar
      int numberOfDays = getDaysInMonth(month);
      for (; count <= numberOfDays; ++count, ++daysInLine, ++(this.startDay)) {
        System.out.print(String.format("%4d", count));
        if (daysInLine == 6) {
          System.out.println();
          daysInLine = -1;
        }
        if (this.startDay == 6)
          this.startDay = -1;
      }
    }

    public void generateCalendar() {
      for (int i = 1; i != 13; ++i) {
        printCalendarHeader(i);
        generateMonth(i);
        System.out.println();
        System.out.println();
      } 
    }
  }

  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a year: ");
    int year = scanner.nextInt();
    System.out.print("Enter the first day of the year (0-6): ");
    int startDay = scanner.nextInt();
    DisplayCalendars meh = new DisplayCalendars();
    Calendar mehmeh = meh.new Calendar(startDay, year);
    mehmeh.generateCalendar();
  }
}
