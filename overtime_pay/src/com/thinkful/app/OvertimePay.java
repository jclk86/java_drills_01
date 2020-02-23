package com.thinkful.app;
import java.util.Scanner;

public class OvertimePay {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("How many hours did you work this week?");
    Double hours = scanner.nextDouble();

    System.out.println("How much do you make per hour in dollars and center?");
    Double pay = scanner.nextDouble();

    if(hours <= 40) {
      System.out.printf("You earned %f this week", hours * pay);
    } else {
      Double overtime = hours % 40;
      Double overtimePay = overtime * (pay / 2);
      Double regularPay = 40 * pay;
      System.out.printf("You worked %f hours overtime, and you earned %f total", hours, regularPay + overtimePay);
    }


  }
}