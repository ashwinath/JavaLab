// File:    Five.java
// Purpose: Calculates and displays speed in Miles Per Hour.
// Author:  Ashwin Nath Chatterji
// Date:    27/01/2016

public class Five {
  public static void main (String[] args) {
    final double KILOMETERSMILESRATIO = 1.6;
    final double MINUTESINHOURS = 60.0;
    final double SECONDSINMINUTES = 60.0;
    double distance = 14.0;
    double timeMinutes = 45.0 + 30.0 / SECONDSINMINUTES;
    double timeHours = timeMinutes / MINUTESINHOURS;
    double speedKmph = distance / timeHours;
    double speedMph = speedKmph / KILOMETERSMILESRATIO;
    System.out.println("Speed in miles per hour: " + speedMph);
  }
}
