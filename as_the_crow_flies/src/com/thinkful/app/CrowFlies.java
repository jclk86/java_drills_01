package com.thinkful.app;
import java.util.Scanner;


public class CrowFlies {

  private static double a(double xOne, double xTwo, double deltaY) {
    return Math.pow(Math.sin((xTwo - xOne) / 2), 2)
        + Math.cos(xOne) * Math.cos(xTwo) * Math.pow(Math.sin(deltaY / 2), 2);
  }

  private static double c(double a) {
    return 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
  }

  private static double d(double c) {
    return 6371 * c;
  }


  private static double distance(double xOne, double xTwo, double yOne, double yTwo) {
    double deltaY = Math.toRadians(yTwo - yOne);
    return d(c(a(Math.toRadians(xOne), Math.toRadians(xTwo), deltaY)));
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please enter first x coordinate in degrees: ");
    double xOne = scanner.nextDouble();

    System.out.println("Please enter first y coordinate in degrees: ");
    double yOne = scanner.nextDouble();

    System.out.println("Please enter second x coordinate in degrees: ");
    double xTwo = scanner.nextDouble();

    System.out.println("Please enter second y coordinate in degrees: ");
    double yTwo = scanner.nextDouble();

    System.out.printf("The calculated distance is %f km", distance(xOne, xTwo, yOne, yTwo));

  }

}