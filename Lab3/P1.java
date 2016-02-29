// File: P1.java
// Purpose: determine quadrants on a graph
// Author: Ashwin Nath Chatterji
// Date: 07-02-2016


public class P1 {
  private static void testQuadrant(double x, double y) {
    if (Math.abs(x) < 1e-8 && Math.abs(y) < 1e-8) {
      System.out.println("on origin");
    } else if (Math.abs(x) < 1e-8) {
      System.out.println("on y axis");
    } else if (Math.abs(y) < 1e-8) {
      System.out.println("on x axis");
    } else {
      if (x > 0) {
        if (y > 0) {
          System.out.println("quadrant 1");
        } else {
          System.out.println("quadrant 4");
        }
      } else {
        if (y > 0) {
          System.out.println("quadrant 2");
        } else {
          System.out.println("quadrant 3");
        }
      }
    }
  }
  public static void main (String[] args) {
    testQuadrant(0,0);
    testQuadrant(1,1);
    testQuadrant(-1,1);
    testQuadrant(-1,-1);
    testQuadrant(1,-1);
    testQuadrant(1,0);
    testQuadrant(0,1);
  }
}
