package com.thinkful.app;
import java.util.Scanner;

public class SalaryCalculator {

  public static void main (String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("What is your hourly rate?");
    Double rate = scanner.nextDouble();

    System.out.println("What was the total amount of hours you worked this week?");
    Double hours = scanner.nextDouble();

    Double weeklyTotal = rate * hours;

    System.out.printf("Your weekly wage is %f", weeklyTotal);
  }

}