package com.thinkful.app;
import java.util.Scanner;

public class MoarLeapYear {

  private static Boolean isLeapYear(double year) {
    boolean success = true;
    

    if (year >= 1584 && year <= 3000) {
      if (year % 4 == 0 && year % 100 != 0) {
        System.out.println("This is a leap year.");
        return success;
      } else if (year % 400 == 0) {
        System.out.println("This is a leap year");
        return success;
      } else {
        System.out.println("Not a leap year");
        return !success;
      }
    } else {
      System.out.println("Not in range to be leap year");
      return !success;
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Boolean oneMoreTime = true;

    do {
      System.out.println("please enter a year");
      Double year = scanner.nextDouble();
      isLeapYear(year);
      System.out.println("continue? true/false");
      oneMoreTime = scanner.nextBoolean();
    } while(oneMoreTime == true);
    
  }
}