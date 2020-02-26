package com.thinkful.app;
import java.util.Scanner;
import java.util.Arrays;

public class pigLatinGen {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a word");
    String word = scanner.next();
    

    final char[] vowels = "aeiou".toCharArray();
    final char[] consonants = "bcdfghjklmnpqrstvwxyz".toCharArray();
   
    String cipher = "";
    // binarySearch(search, item to search)
    if (Arrays.binarySearch(vowels, word.toLowerCase().charAt(0)) > -1 || word.length() == 1) {
      cipher += word + "ay";
    } else if (Arrays.binarySearch(consonants, word.toLowerCase().charAt(0)) > -1) {
      cipher += word.substring(1) + word.charAt(0) + "ay";
    }
    System.out.println(cipher);
  }
}