package com.thinkful.app;
import java.util.Scanner;

public class TempConverter {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please provide temperature in celcius:");
    Double celcius = scanner.nextDouble();

    System.out.printf("Your temperature converetedto Fahrenheight: %f", celcius * 9/5 + 32);

  }
}