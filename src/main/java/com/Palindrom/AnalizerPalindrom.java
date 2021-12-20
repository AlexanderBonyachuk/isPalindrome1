package com.Palindrom;

public class AnalizerPalindrom {

        public boolean isPalindrome(String str1) {
            boolean isPalindrome = true;
            str1 = str1.toUpperCase();
            StringBuilder str2 = new StringBuilder(str1).reverse();
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) != str2.charAt(i)) {
                    isPalindrome = false;
                }
            }
            return isPalindrome;
        }
}
