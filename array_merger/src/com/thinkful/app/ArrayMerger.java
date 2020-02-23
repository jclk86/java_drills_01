package com.thinkful.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrayMerger {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    // only number inputs, which is a string, but can be parsed into integers. 
    System.out.println("Please specify first string with commas: ");
    String firstArrayAsString = scanner.next();

    System.out.println("Please specify second string with commas: ");
    String secondArrayAsString = scanner.next();

    String[] firstArray = firstArrayAsString.split(",");
    Arrays.sort(firstArray);

    String[] secondArray = secondArrayAsString.split(",");
    Arrays.sort(secondArray);


    // the set up
    List<Integer> result = new ArrayList<>();
    // beginning and end points of iteration
    int i = 0, j = 0, maxFirstIndex = firstArray.length - 1, maxSecondIndex = secondArray.length - 1; 

    // Because the user input is a string that converts to string arrays, you need this string array to 
    // to merge both string arrays into one before parsing each string numbers into real integers. 
    List<String> tempList = new ArrayList<String>(Arrays.asList(firstArray));
    tempList.addAll(Arrays.asList(secondArray));

      // creates loop. Tests 1 value in 1 array against
      // and let's not forget both numbers arrays are sorted already respectively. This 
      // influences the way we compare. 
    do {
      // initialize starting point 
      Integer a = Integer.parseInt(firstArray[i]);
      Integer b = Integer.parseInt(secondArray[j]);

      if(a > b || a.equals(b)) {
        // this is making sure the value is still there in the temporary holding array. If a value is used, then it gets removed. 
        if(tempList.indexOf(b.toString()) != -1) {
          // add to new array
          result.add(b);
          // remove from the temp array so you don't create infinite loop 
          tempList.remove(b.toString());
          // only iterate the j, so that it will compare i to the incrementing j
          if(j < maxSecondIndex) j++;
        } else if(tempList.indexOf(a.toString()) != -1) {
          result.add(a);
          tempList.remove(a.toString());
          if(i < maxFirstIndex) i++; 
        }
      } else {
        if(tempList.indexOf(a.toString()) != -1) {
          result.add(a);
          tempList.remove(a.toString());
          if(i < maxSecondIndex) i++;
        } else if (tempList.indexOf(b.toString()) != -1) {
          result.add(b);
          tempList.remove(b.toString());
          if(j < maxFirstIndex) j++; 
        }
      }
    } while (result.size() < maxFirstIndex + maxSecondIndex + 2);
    System.out.println(result.toString());


    // List<Integer> resultTwo = new ArrayList<>();
    // for (String a : firstArray) {
    //   resultTwo.add(Integer.parseInt(a));
    // }
    // for (String b : secondArray) {
    //   resultTwo.add(Integer.parseInt(b));
    // }
    // Collections.sort(resultTwo);
    // System.out.println(resultTwo.toString());
  }
}