package easy.binarysearch;

import java.util.HashMap;

public class RomanToIntegerLeetCode {

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));

    }

    public static int romanToInt(String s) {
        HashMap<Character, Integer> hs = new HashMap<>();
        hs.put('I', 1);
        hs.put('V', 5);
        hs.put('X', 10);
        hs.put('L', 50);
        hs.put('C', 100);
        hs.put('D', 500);
        hs.put('M', 1000);

        int result = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            if (hs.get(s.charAt(i)) < hs.get(s.charAt(i + 1))) {
                result -= hs.get(s.charAt(i));
            } else {
                result += hs.get(s.charAt(i));
            }
        }

        return result + hs.get(s.charAt(s.length() - 1));


    }
}
