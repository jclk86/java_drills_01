package com.thinkful.app;
import java.util.Random;

public class PasswordGen {
  //f you convert an int to a char, the integer value is used as the index of the character in the ASCII table. So this code uses the ASCII code of an uppercase A (65) and adds 0 to 25 to it to get an character from A to Z.

// As @ruakh said in the comments, you should add values in the range [0, 25] to A to get the characters from A to Z. Therefore use Math.random() * 26 instead of Math.random() * 27.
  public static void main(String[] args) {

    Random ran = new Random();

    // get a randomly generated length between 6 and 70 inclusively
    int length = ran.nextInt(70 - 6) + 6;

    // create char array, which is empty but initiated with length 
    char[] chars = new char[length];

    // ensure we get at least one upper case letter
    char upper = (char) (ran.nextInt(90 - 65) + 65); 
    chars[0] = upper;

    // ensure we get at least one lower case letter
    char lower = (char) (ran.nextInt(122 - 97) + 97); 
    chars[1] = lower;

    // ensure we get at least one punctuation
    final String puncs = "!`~@#$%*+_\\-^&{[}]=|(.?:;\"')/";
    char punc = puncs.charAt(ran.nextInt(puncs.length()));
    chars[2] = punc;

    // ensure we get at least one digit
    char digit = (char) (ran.nextInt(57 - 48) + 48);
    chars[3] = digit;

    // randomly generate the rest of the password
    for (int i = 4; i < length; i++) {
      chars[i] = (char) (ran.nextInt(126 - 33) + 33);
    }

    // finally shuffle the first 4 chars into the array to ensure their
    // positions are random.
    for (int i = 0; i <= 3; i++) {
      int randomIndex = ran.nextInt(length);
      char temp = chars[i];
      chars[i] = chars[randomIndex];
      chars[randomIndex] = temp;
    }

    System.out.printf("Your password is: %s\n", new String(chars));
  }

}