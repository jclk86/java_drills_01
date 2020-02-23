package com.thinkful.app;
import java.util.Scanner;


public class TotalBillCalc {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("What is the subtotal of the bill?");
    Double subtotal = scanner.nextDouble();

    System.out.println("What is the tax rate in percentage?");
    Double tax = scanner.nextDouble();

    System.out.println("What is the tip percentage?");
    Double tip = scanner.nextDouble();

    System.out.printf("Your total bill is: %f", subtotal + subtotal * tip / 100 + subtotal * tax / 100 );
  }
}