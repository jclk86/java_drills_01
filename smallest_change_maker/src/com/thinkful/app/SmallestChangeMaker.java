package com.thinkful.app;
import java.util.Scanner;

public class SmallestChangeMaker {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please enter $ amount: ");

  
    double amount = scanner.nextDouble();
    // the (int) applies type to 
    int amountInt = (int)Math.floor(amount * 100);

    int hundreds = 0;
    int fifties = 0;
    int twenties = 0;
    int tens = 0;
    int fives = 0;
    int ones = 0;
    int quarters = 0;
    int dimes = 0;
    int nickles = 0;
    int pennies = 0;

    // the the variable amountInt get reassigned 
    hundreds = amountInt / 10000;
    amountInt = amountInt % 100000;


    fifties = amountInt / 5000;
    amountInt = amountInt % 5000;


    twenties = amountInt / 2000;
    amountInt = amountInt % 2000;


    tens = amountInt / 1000;
    amountInt = amountInt % 1000;


    fives = amountInt / 500;
    amountInt = amountInt % 500;


    ones = amountInt / 100;
    amountInt = amountInt % 100;


    quarters = amountInt / 25;
    amountInt = amountInt % 25;

    dimes = amountInt / 10;
    amountInt = amountInt % 10;


    nickles = amountInt / 5;
    pennies = amountInt % 5;


    System.out.printf(
        "To make $%.2f, you will receive\n"
        + "%d $100 Bills\n"
        + "%d $50 Bills\n"
        + "%d $20 Bills\n"
        + "%d $10 Bills\n"
        + "%d $5 Bills\n"
        + "%d $1 Bills\n"
        + "%d Quarters\n"
        + "%d Dimes\n"
        + "%d Nickles\n"
        + "%d Pennies\n",
        amount, hundreds, fifties, twenties, tens, fives, ones, quarters, dimes, nickles, pennies);
  
    
  }

}