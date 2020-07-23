package edu.pdx.cs410J.jcaillie;

import java.util.Stack;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Kata {
                                                                                    

  public static void main(String[] args) {
    for (String arg : args)
      System.out.println(arg);
    System.exit(1);
  }

  public static int RPN(String[] args)
  {
    Stack parseStack = new Stack<Integer>();
    for(String arg : args) {
      String operators = "+-/*";
      if(operators.contains(arg)) {
        doOperation();
      } else {
        try {
          Integer.parseInt(arg);
        } catch(NumberFormatException ex) {
          System.err.println(ex);
        }
      }
  }

  private static void doOperation(String arg) {
    switch(arg) {
      case "+":
    }
  }
}