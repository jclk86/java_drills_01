package com.thinkful.app;
import java.util.Scanner;

public class TravelSpeed {

  public static void main (String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Please enter the distance to your destination: ");
    double distance = scanner.nextDouble();

    System.out.println("Please enter a length of time to get to your destination: ");
    double time = scanner.nextDouble();

    System.out.printf("%f", distance / time);


  }
}