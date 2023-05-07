package easy.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/559/
 * Input: digits = [1,2,3]
 * Output: [1,2,4]
 * Explanation: The array represents the integer 123.
 * Incrementing by one gives 123 + 1 = 124.
 * Thus, the result should be [1,2,4].
 * <p>
 * Input: digits = [4,3,2,1]
 * Output: [4,3,2,2]
 * Explanation: The array represents the integer 4321.
 * Incrementing by one gives 4321 + 1 = 4322.
 * Thus, the result should be [4,3,2,2].
 * <p>
 * Input: digits = [9]
 * Output: [1,0]
 * Explanation: The array represents the integer 9.
 * Incrementing by one gives 9 + 1 = 10.
 * Thus, the result should be [1,0].
 */
public class PlusOne {
    public static void main(String[] args) {
        int[] arr = {9, 9};
        System.out.println(Arrays.toString(plusOneOptimize(arr)));


    }

    public static int[] plusOneOptimize(int[] arr) {

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] < 9) {
                arr[i]++;
                return arr;
            }
            arr[i] = 0;
        }

        int[] result = new int[arr.length + 1];
        result[0] = 1;
        return result;
    }

    public static int[] optimized2(int[] digits) {
        List<Integer> list = new ArrayList<>();
        int carry = 0;
        int sz = digits.length - 1;
        if ((digits[sz] + 1) >= 10) {
            carry = 1;
            list.add(0);
        } else {
            list.add(digits[sz] + 1);
        }

        for (int i = sz - 1; i >= 0; i--) {
            list.add((carry + digits[i]) % 10);
            carry = (carry + digits[i]) / 10;
        }
        if (carry >= 1) {
            list.add(carry);
        }
        Collections.reverse(list);

        int arr[] = new int[list.size()];
        int x = 0;
        for (int i : list) {
            arr[x] = i;
            // 	System.out.println(arr[x]);
            ++x;
        }
        return arr;
    }
}
