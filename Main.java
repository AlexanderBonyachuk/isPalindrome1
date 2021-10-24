package com.company;

public class Main {

    public static void main(String[] args) {
        String text = "ABcvvba 2345 ABba";
        System.out.println(isPalindrome(text));
    }

    public  static boolean isPalindrome(String text) {
        String s1 = text.toUpperCase().replaceAll("[^A-Za-z]","");  //убираем все кроме букв
        StringBuffer s2 = new StringBuffer(s1).reverse();
        boolean answer = true;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                answer = false;
            }
        }
        return answer;
    }
}
