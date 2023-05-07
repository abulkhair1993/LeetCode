package easy.string;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/explore/featured/card/top-interview-questions-easy/127/strings/881/
 * Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
 * <p>
 * Example 1:
 * <p>
 * Input: s = "leetcode"
 * Output: 0
 * Example 2:
 * <p>
 * Input: s = "loveleetcode"
 * Output: 2
 * Example 3:
 * <p>
 * Input: s = "aabb"
 * Output: -1
 */

public class FirstUniqueCharacter {

    public static void main(String[] args) {
        System.out.println(bruteForce("loveleetcode"));

    }

    public static int bruteForce(String input) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < input.length() - 1; i++) {
            boolean flag = true;
            for (int j = i+1; j < input.length(); j++) {
                if(input.charAt(i) == input.charAt(j)) {
                    flag = false;
                    set.add(input.charAt(i));
                    break;
                }
            }
            if(flag && !set.contains(input.charAt(i))) {
                return i;
            }
        }
        return -1;
    }
}
