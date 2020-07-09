package edu.pdx.cs410J.jcaillie;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Kata {


  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
    System.exit(1);
  }


  public static String convertToRoman(int number) {
    if (number == 1)
      return "I";
    else if (number == 2)
      return "II";
    else if (number ==3)
      return "III";
    else
      return "not programmed";
  }
}