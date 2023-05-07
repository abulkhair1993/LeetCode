package easy.array;

import java.util.Arrays;

/**
 * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once.
 * The relative order of the elements should be kept the same. *
 * Since it is impossible to change the length of the array in some languages,
 * you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing
 * the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first
 * k elements. *
 * Return k after placing the final result in the first k slots of nums.
 * <p>
 * Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.
 * <p>
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/727/
 * Input: nums = [1,1,2]
 * Output: 2, nums = [1,2,_]
 * Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
 * It does not matter what you leave beyond the returned k (hence they are underscores).
 * *******************************************************************************
 * Input: nums = [0,0,1,1,1,2,2,3,3,4]
 * Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
 * Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
 * It does not matter what you leave beyond the returned k (hence they are underscores).
 */

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        // int[] nums = {1,1,2};

        int r = 1;
        int l = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[r] == nums[r - 1]) {
                r++;
            } else {
                nums[l] = nums[r];
                r++;
                l++;
            }
        }
        for (int i = l; i < nums.length; i++) {
            nums[i] = -1;
        }


        System.out.println(l);
        System.out.println(Arrays.toString(nums));

    }

    // Java 8 way
    class Solution {
        public int removeDuplicates(int[] nums) {
            int[] ints = Arrays.stream(nums).distinct().toArray();

            for (int i = 0; i < ints.length; i++) {
                nums[i] = ints[i];
            }

            return ints.length;
        }
    }
}
