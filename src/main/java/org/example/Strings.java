package org.example;

public class Strings {

    /**
     * Returns the string Foo
     * @return string "Foo"
     */
    public static String sendFoo() {
        return "Foo";
    }

    /**
     * Returns the string Bar
     * @return string "Bar"
     */
    public static String sendBar() {
        return "Bar";
    }

    /**
     * Combines to strings
     * @param str1 first string
     * @param str2 second string
     * @return concatenated strings
     */
    public static String addWords(String str1, String str2) {
        return str1 + str2;
    }
}