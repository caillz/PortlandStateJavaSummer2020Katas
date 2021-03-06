package edu.pdx.cs410J.jcaillie;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class KataTest{
//{
 //@Test(expected = ExceptionInInitializerError)
  //public void lessThenZero(){
   //Kata.convertToRoman(-1);
 //}
  @Test
  public void onetoIromannumeral(){
    assertThat(Kata.convertToRoman(1),equalTo("I"));
  }

  @Test
  public void twoToRomanNumeral(){
    assertThat(Kata.convertToRoman(2), equalTo("II"));
  }

  @Test
  public void threeToRomanNumeral(){
    assertThat(Kata.convertToRoman(3), equalTo("III"));
  }

  @Test
  public void fourToRomanNumeral() {
    assertThat(Kata.convertToRoman(4), equalTo("IV"));
  }

  @Test
  public void fiveToRomanNumber() {
    assertThat(Kata.convertToRoman(5),equalTo("V"));
  }

}
