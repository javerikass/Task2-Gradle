package org.example;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class StringUtilsTest {

  @Test
  void isPositiveNumber() {
    assertTrue(StringUtils.isPositiveNumber("10"));
    assertFalse(StringUtils.isPositiveNumber("-5"));
    assertFalse(StringUtils.isPositiveNumber("abc"));
  }
}