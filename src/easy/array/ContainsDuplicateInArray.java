package easy.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ContainsDuplicateInArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //System.out.println(containsDuplicate1(nums));
        System.out.println(containsDuplicate2(nums));
    }

    // brute force
    private static boolean containsDuplicate1(int[] nums) {
        int c = 1;

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = c; j < nums.length; j++) {
                if (nums[i] == nums[j]) return true;
            }
            c++;
        }
        return false;
    }

    // Optmized
    private static boolean containsDuplicate2(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) return true;
        }
        return false;
    }

    // more optimized
    public boolean containsDuplicate3(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) != null) {
                return true;
            } else {
                map.put(nums[i], nums[i]);
            }
        }
        return false;
    }

    //optimized
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            int before = set.size();
            set.add(num);
            if (set.size() == before) {
                return true;
            }
        }
        return false;
    }


}
