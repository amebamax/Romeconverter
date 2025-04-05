package edu.pzks;

public class Main {
    public static String intToRoman(int num) {
        if (num <= 0) {
            return "Roman numerals are only defined for positive integers.";
        }

        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                result.append(symbols[i]);
                num -= values[i];
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        int[] testCases = {2, 12, 27, 4, 9, 40, 90, 400, 900, 2025};
        for (int num : testCases) {
            System.out.println(num + " -> " + intToRoman(num));
        }
    }
}