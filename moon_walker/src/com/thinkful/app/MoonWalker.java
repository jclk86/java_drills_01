package com.thinkful.app;
import java.util.Scanner;

public class MoonWalker {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please enter weight in lbs: ");
    double yourEarthWeightInPounds = scanner.nextDouble();

    double yourEarthWeightInKg = yourEarthWeightInPounds / 2.2046226218;
    final double gravitationalConstant = 6.67E-11;
    final double moonMassKg = 7.35E22;
    final double moonRadiusM = 1.7355E6;
    final double earthForceOfGravity = 9.81;
    final double yourMass = yourEarthWeightInKg / earthForceOfGravity;
    final double moonForceOfGravity = gravitationalConstant * moonMassKg / (moonRadiusM * moonRadiusM);
    final double resultingMoonLbs = moonForceOfGravity * yourMass * 2.2046226218;

    System.out.printf("Your weight on the moon is roughly %f lbs \n", resultingMoonLbs);

  }

}