package easy.array;

import java.util.HashMap;

public class TwoSumLeetCode {

    public static void main(String[] args) {
        int nums[] = {2, 7, 11, 15};
        twoSum(nums, 9);

    }


    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hs = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer y = (Integer) target - nums[i];
            if (hs.containsKey(y)) {
                int ans[] = {hs.get(y), i};

            }
            hs.put(nums[i], i);
        }

        return null;

    }
}