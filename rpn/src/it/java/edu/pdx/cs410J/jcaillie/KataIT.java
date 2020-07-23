package edu.pdx.cs410J.jcaillie;

import edu.pdx.cs410J.InvokeMainTestCase;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.StringContains.containsString;

public class KataIT extends InvokeMainTestCase {

  @Test
  public void invokingMainWithNoArgumentsHasExitCodeOf1() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Kata.class);
    assertThat(result.getExitCode(), equalTo(1));
  }

  @Test
  public void invokingMainPrintsItsArguments() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Kata.class, "20", "5", "/");
    assertThat(result.getTextWrittenToStandardOut(), containsString("20\n5\n/\n"));
  }
}
