package com.thinkful.app;

public class DebugArraySorter {
  public static void main(String[] args) {
    int[] keys = { 34, 12, 14, 17, 8, 3, 45, 56, 37, 27, 30, 19, 18, 53, 24 };
    DebugArraySorter ins = new DebugArraySorter();
    int[] sorted = ins.sort(keys);
    for (int i : sorted) {
      System.out.println(i);
    }
  }

  public int[] sort(int[] a) {
    for (int j = 1; j < a.length; j++) {
      int i = j - 1;
      int temp = a[j];
      while (i > 0 && a[i] > temp) {
        a[i + 1] = a[i];
        i--;
      }
      a[i + 1] = temp;
    }
    return a;
  }
}