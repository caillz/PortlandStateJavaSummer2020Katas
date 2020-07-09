package edu.pdx.cs410J.jcaillie;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class KataTest
{


  @Test
  public void onetoIromannumeral(){
    assertThat(Kata.convertToRoman(),equalTo("I"));

  }

}
