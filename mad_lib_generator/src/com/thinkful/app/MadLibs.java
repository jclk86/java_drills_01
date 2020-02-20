package com.thinkful.app;
import java.util.Scanner;

public class MadLibs {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please enter name: ");
    String name = scanner.next();
    System.out.println("Please enter adjective");
    String adjective_one = scanner.next();
    System.out.println("Please enter another adjective");
    String adjective_two = scanner.next();
    System.out.println("Please enter workpace type");
    String workplace_type = scanner.next();
    System.out.println("Please enter another adjective");
    String adjective_three = scanner.next();
    System.out.println("Please enter another adjective");
    String adjective_four = scanner.next();
    System.out.println("Please enter a personal characteristic");
    String personal_characteristic = scanner.next();
    System.out.println("Please enter a personality trait");
    String personality_trait = scanner.next();
    System.out.println("Please enter final adjective");
    String adjective_five = scanner.next();
    System.out.println("Please enter a verb");
    String verb = scanner.next();
    System.out.println("Please enter a pronoun");
    String pronoun = scanner.next();

    System.out.printf("%s is a person of an %s disposition and is %s in the %s for his %s and the %s of his %s. This circumstance, added to his well-known %s and %s courage, made me very desirous to %s %s", name, adjective_one, adjective_two, workplace_type, adjective_three, adjective_four, personal_characteristic, personality_trait, adjective_five, verb, pronoun);
  }
};