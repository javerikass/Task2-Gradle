package org.example;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class UtilsTest {

  @Test
  void isAllPositiveNumbers() {
    assertTrue(Utils.isAllPositiveNumbers("12", "79"));
    assertFalse(Utils.isAllPositiveNumbers("12", "-79"));
    assertFalse(Utils.isAllPositiveNumbers("12", "abc"));
  }
}