package com.thinkful.app;
import java.util.Scanner;

public class VowelCounter {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a word");
    String word = scanner.next();

    final String vowels = "aeiouAEIOU";

    int vowelCount = 0;

    for(int i = 0; i < word.length(); i++) {
      if(vowels.indexOf(word.charAt(i)) != -1) vowelCount++; 
    }
  
    System.out.printf("Your word has %d vowels!", vowelCount);
  }
}