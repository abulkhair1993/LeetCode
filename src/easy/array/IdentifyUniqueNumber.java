package easy.array;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/549/
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
 * <p>
 * You must implement a solution with a linear runtime complexity and use only constant extra space.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [2,2,1]
 * Output: 1
 * Example 2:
 * <p>
 * Input: nums = [4,1,2,1,2]
 * Output: 4
 * Example 3:
 * <p>
 * Input: nums = [1]
 * Output: 1
 */
public class IdentifyUniqueNumber {
    public static void main(String[] args) {
        int nums[] = {2, 2, 3, 3, 5, 5};

        System.out.println(singleNumber2(nums));

    }

    /**
     * Most optimal solution
     */

    public static int singleNumber2(int[] numbers) {
        Map<Integer, Boolean> map = new HashMap<>();

        for (int number : numbers) {
            map.put(number, !map.getOrDefault(number, false));
        }

        for (Map.Entry<Integer, Boolean> entry : map.entrySet()) {
            if (entry.getValue()) {
                return entry.getKey();
            }
        }
        return Integer.MIN_VALUE;
    }

    /**
     * Brute force
     */
    public static int singleNumber(int[] numbers) {
        // ----------------------------------------------
        // Brute Force -- O(n**2),  Space Complexity O(1)
        // ----------------------------------------------
        int len = numbers.length;
        boolean isTwice = false;
        for (int i = 0; i < len; i++) {
            isTwice = false;
            for (int j = 0; j < len; j++) {
                if (isTwice) {
                    break;
                }
                ;
                if (i != j)
                    if (numbers[i] == numbers[j])
                        isTwice = true;
            }
            if (!isTwice) return numbers[i];
        }
        return numbers[len - 1];
    }
}
