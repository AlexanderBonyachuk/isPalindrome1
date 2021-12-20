package com.dmdev.project_1;

import com.Palindrom.AnalizerPalindrom;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestClass {

    @Test
    void test() {
        assertTrue(true);
    }

    @Test
    public void isPalindr() {
        AnalizerPalindrom a1 = new AnalizerPalindrom();
        assertTrue(a1.isPalindrome("шалаш"));
    }
}
