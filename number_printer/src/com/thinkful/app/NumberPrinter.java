package com.thinkful.app; 
import java.util.Scanner;

public class NumberPrinter {

  public static void main (String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter 5-digit number");
    
    Integer numbers = scanner.nextInt();

    String[] digits = Integer.toString(numbers).split("");

    for(int i = 0; i < digits.length; i++) {
      System.out.println(digits[i]);
    }
  }

}