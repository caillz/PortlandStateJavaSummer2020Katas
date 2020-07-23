package edu.pdx.cs410J.jcaillie;

import jdk.jshell.spi.ExecutionControl;

import java.util.Stack;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Kata {
  public static Stack<Integer> parseStack = new Stack<Integer>();

  public static void main(String[] args) throws ExecutionControl.NotImplementedException {
    System.out.println(RPN(args));
    System.exit(1);
  }

  public static int RPN(String[] args) throws ExecutionControl.NotImplementedException {
    for(String arg : args) {
      String operators = "+-/*";
      if (operators.contains(arg)) {
        doOperation(arg);
      } else {
        try {
          parseStack.push(Integer.parseInt(arg));
        } catch (NumberFormatException ex) {
          System.err.println(ex);
        }
      }
    }

    return parseStack.pop();
  }

  private static void doOperation(String arg) throws ExecutionControl.NotImplementedException {
    int arg1 = parseStack.pop();
    int arg2 = parseStack.pop();
    switch(arg) {
      case "+":
        parseStack.push(parseStack.pop() + parseStack.pop());
        break;
      case "-":
        parseStack.push(arg2 - arg1);
        break;
      case "/":
        parseStack.push(arg2 / arg1);
        break;
      case "*":
        parseStack.push(parseStack.pop() * parseStack.pop());
        break;
      default:
        throw new ExecutionControl.NotImplementedException("Not implemented");

    }
  }
}