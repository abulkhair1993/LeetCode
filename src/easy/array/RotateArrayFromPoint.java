package easy.array;

import java.util.*;

public class RotateArrayFromPoint {
    public static void main(String[] args) {
        //int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int[] nums = {-1, -100, 3, 99};
        int k = 2;
        k = k % nums.length; // if we have let's say 101 to rotate, then we only rotate it 1 time not 101 times
        if (k < 0) {
            k += nums.length;
        }
        rotate(nums, 0, nums.length - k - 1);
        rotate(nums, nums.length - k, nums.length - 1);
        rotate(nums, 0, nums.length - 1);
        System.out.println(nums);

    }
    //3,99,-1,-100

    public static void rotate(int[] arr, int start, int end) {
        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    //Optimized solution
    class Solution {
        public void rotate(int[] nums, int k) {
            if (nums.length == 1)
                return;
            k = k % nums.length;
            Deque<Integer> deque = new ArrayDeque<>();
            for (int i = 0; i < nums.length - k; i++) {
                deque.add(nums[i]);
            }
            for (int i = nums.length - 1; i >= nums.length - k; i--) {
                deque.addFirst(nums[i]);
            }
            int j = 0;
            for (Iterator itr = deque.iterator();
                 itr.hasNext(); ) {
                nums[j] = (int) itr.next();
                j++;
            }
        }
    }

    // More optimized solution
    class Solution2 {
        public void rotate(int[] nums, int k) {
            List<Integer> ans = new ArrayList<>();
            int z = nums.length;

            if (nums.length < k) k = k % z;

            int n = nums.length - k;

            for (int i = n; i < nums.length; i++) {
                ans.add(nums[i]);
            }
            for (int i = 0; i < n; i++) {
                ans.add(nums[i]);
            }
            for (int i = 0; i < ans.size(); i++) {
                nums[i] = ans.get(i);
            }
        }
    }

}
