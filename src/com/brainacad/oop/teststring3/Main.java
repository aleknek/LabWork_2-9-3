package com.brainacad.oop.teststring3;

public class Main {

    public static void main(String[] args) {

        String sourceString = "Brain Academy";
        char[] uniqueChars = uniqueChars(sourceString);

        System.out.println("source string is - " + sourceString);
        System.out.print("unique chars are - ");

        if (uniqueChars != null) {
            for (char item : uniqueChars) {
                if (item == '\000') continue;
                System.out.print(item);
            }
        }
    }

    public static char[] uniqueChars(String s) {

        char[] uniqueChars = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            if (s.lastIndexOf(s.charAt(i)) == s.indexOf(s.charAt(i))) {
                uniqueChars[i] = s.charAt(i);
            }
        }
        return uniqueChars;
    }
}
