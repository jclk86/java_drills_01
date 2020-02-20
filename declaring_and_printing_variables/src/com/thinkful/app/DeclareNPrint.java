package com.thinkful.app;

public class DeclareNPrint {

  public static void main (String[] args) {
    Integer temperature = 79;
    String highestTemp = "highest temperature in June in New York us %d °F \n";
    System.out.printf(highestTemp, temperature);
    
    String courseName = "Name of the course is \"Java/Spring programming\" \n";
    System.out.printf(courseName);

    String phoneNumber = "The number of the bus service is 555-5555 \n";
    System.out.printf(phoneNumber);

    Double price = 39.98;
    String shoeCost = "The price of the shoe is $%f \n";
    System.out.printf(shoeCost, price);

    Double mass = 1.89813E27;
    String numericMass = "the mass of the planet Jupiter is %f kilograms \n";
    System.out.printf(numericMass, mass);
  }

};