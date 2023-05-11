public class Solution {
    public static int romanToInt(String s) {
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            int currValue = getValue(s.charAt(i));
            if (i + 1 < s.length()) {
                int nextValue = getValue(s.charAt(i + 1));
                if (currValue < nextValue) {
                    result -= currValue;
                } else {
                    result += currValue;
                }
            } else {
                result += currValue;
            }
        }

        return result;
    }

    private static int getValue(char symbol) {
        switch (symbol) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                throw new IllegalArgumentException("Invalid Roman numeral: " + symbol);
        }
    }

    public static void main(String[] args) {
        String romanNumeral = "MCMXCIV";
        int result = romanToInt(romanNumeral);
        System.out.println(result);
    }
}
