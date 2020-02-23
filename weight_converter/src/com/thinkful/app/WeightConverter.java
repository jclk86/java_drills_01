package com.thinkful.app;
import java.util.Scanner;

public class WeightConverter {

  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("What is your weight in pounds?");
    Double weight = scanner.nextDouble();

    Double kilos = weight/2.2046; 

    System.out.printf("Your weight in kilos is: %f", kilos);
  }

}