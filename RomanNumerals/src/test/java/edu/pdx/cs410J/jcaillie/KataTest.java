package edu.pdx.cs410J.jcaillie;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class KataTest
{

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

}
