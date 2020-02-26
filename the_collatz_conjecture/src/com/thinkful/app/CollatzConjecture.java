package com.thinkful.app;
import java.util.Scanner;



public class CollatzConjecture {

  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter an integer: ");
    Integer number = scanner.nextInt();

    System.out.println(number);

    do {
      //even
      if (number % 2 == 0) {
        number = number / 2;

      //odd
      } else {
        number = 3 * number + 1;
      }

      System.out.println(number);

    } while (number != 1);

  }
}