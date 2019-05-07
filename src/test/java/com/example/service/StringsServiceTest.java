package com.example.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author gilfanovrenat
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class StringsServiceTest {

  @Autowired
  private StringsService stringsService;

  @Test
  public void inverseTest() {
    assertEquals(stringsService.inverseString("abs"), "sba");
  }

  @Test
  public void palindromeTest() {
    assertTrue(stringsService.isPalindrome("арозаупаланалапуазора"));
    assertFalse(stringsService.isPalindrome("qwqkcslmcskld"));
  }

  @Test
  public void longestUniqueSubstringTest() {
    String s = "1234567890qwertyuiop1231231231312313213123123";
    assertEquals(stringsService.getLongestSubstringWithUniqueChars(s), "1234567890qwertyuiop");
  }
}
