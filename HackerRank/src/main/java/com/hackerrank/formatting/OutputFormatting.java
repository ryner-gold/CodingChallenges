package com.hackerrank.formatting;

public class OutputFormatting {
  public static void main(String[] args) {

    String ns = fStr("hello", 15);
    String ni = fInt(5);
    System.out.println(ns + ni);

    String nsTwo = fStr("hello", 15);
    String niTwo = fInt(65);
    System.out.println(nsTwo + niTwo);

    String nsThree = fStr("hello", 15);
    String niThree = fInt(105);
    System.out.println(nsThree + niThree);

  }

  public static String fStr(final String s, final int minWidth) {
    return String.format("%1$-" + minWidth + "s", s);
  }

  public static String fInt(final int i) {
      return String.format("%1$" + 3 + "s", i).replace(' ', '0');
  }
}
