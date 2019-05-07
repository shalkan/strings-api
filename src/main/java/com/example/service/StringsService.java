package com.example.service;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author gilfanovrenat
 */

@Component
public class StringsService {

  public String inverseString(String inputString) {
    char[] charArr = inputString.toCharArray();
    int arrLength = charArr.length;
    for (int i = 0; i < arrLength / 2; i++) {
      char temp = charArr[i];
      charArr[i] = charArr[arrLength - i - 1];
      charArr[arrLength - i - 1] = temp;
    }
    return new String(charArr);
  }

  public boolean isPalindrome(String inputString) {
    char[] charArr = inputString.toCharArray();
    int arrLength = charArr.length;
    boolean isPalindrome = true;
    for (int i = 0; i < arrLength / 2; i++) {
      isPalindrome = isPalindrome && charArr[i] == charArr[arrLength - i - 1];
    }
    return isPalindrome;
  }

  public String getLongestSubstringWithUniqueChars(String inpnutString) {
    int i;
    int stringLength = inpnutString.length();
    int curStart = 0;
    int currLength = 0;
    int maxLength = 0;
    int start = 0;

    Map<Character, Integer> charPositionMap = new HashMap<>();

    for (i = 0; i < stringLength; i++) {
      if (!charPositionMap.containsKey(inpnutString.charAt(i)))
        charPositionMap.put(inpnutString.charAt(i), i);
      else {
        if (charPositionMap.get(inpnutString.charAt(i)) >= curStart) {
          currLength = i - curStart;
          if (maxLength < currLength) {
            maxLength = currLength;
            start = curStart;
          }
          curStart = charPositionMap.get(inpnutString.charAt(i)) + 1;
        }
        charPositionMap.put(inpnutString.charAt(i), i);
      }
    }

    if (maxLength < i - curStart) {
      maxLength = i - curStart;
      start = curStart;
    }

    return inpnutString.substring(start, start + maxLength);
  }
}
