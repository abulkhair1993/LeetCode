package easy.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/882/
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 * <p>
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: s = "anagram", t = "anagram"
 * Output: true
 * Example 2:
 * <p>
 * Input: s = "rat", t = "car"
 * Output: false
 */
public class Anagram {

    public static void main(String[] args) {
        int a = 'z';
        int b = 'A';
        System.out.println(b);
        System.out.println(a);


        //System.out.println(isAnagram2("anagram", "anagram"));
    }

    public static boolean isAnagram(String s, String t) {
        int[] alphabet = new int[26];
        for (int i = 0; i < s.length(); i++) {
            alphabet[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            alphabet[t.charAt(i) - 'a']--;
        }
        for (int i : alphabet) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Java 8 ways of doing the work
     */
    public static boolean isAnagram1(String s, String t) {
        Map<Character, Long> txt1 = count(s);
        Map<Character, Long> txt2 = count(t);
        return txt1.equals(txt2);
    }

    public static Map<Character, Long> count(String txt) {
        Map<Character, Long> map = new HashMap<>();
        txt.chars().forEach(it -> map.compute((char) it, (k, v) -> (v == null) ? 1 : v + 1));
        return map;
    }

    /**
     * Easiest way of doing the work
     */

    public static boolean isAnagram2(String s, String t) {
        char[] s1=s.toCharArray();
        char[] t1=t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);
        return Arrays.equals(s1,t1);
    }
}
