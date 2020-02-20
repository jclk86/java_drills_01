package com.thinkful.app;

public class ReceiptPrinter {

public static void main(String[] args) {  
    StringBuffer sb = new StringBuffer();
    final String lineBreak = System.getProperty("line.separator");
    
    sb.append("Bill");
    sb.append(lineBreak);
    sb.append("------------------");
    sb.append(lineBreak);
    sb.append("Pizza       $12.99");
    sb.append(lineBreak);
    sb.append("Soda         $1.25");
    sb.append(lineBreak);
    sb.append("Cookies      $2.50");
    sb.append(lineBreak);
    sb.append("SubTotal:   $16.74");
    sb.append(lineBreak);
    sb.append("Tax(10%):    $1.67");
    sb.append(lineBreak);
    sb.append("Service(15%):$2.51");
    sb.append(lineBreak);
    sb.append("------------------");
    sb.append(lineBreak);
    sb.append("Total:      $20.92");
    sb.append(lineBreak);
    sb.append("------------------");

    System.out.println(sb.toString());
  }
};