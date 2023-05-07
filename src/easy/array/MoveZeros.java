package easy.array;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};

        System.out.println(Arrays.toString(mysolution2(nums)));


    }

    public static int[] mysolution2(int[] nums) {
        int pos = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[pos] = nums[i];
                pos++;
            }
        }
        while (pos < nums.length) {
            nums[pos++] = 0;
        }


        return nums;
    }

    public void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != 0) {
                continue;
            } else {
                int j = i;
                while (j < nums.length - 1 && nums[j] == 0) {
                    j++;
                }
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }

    }
}