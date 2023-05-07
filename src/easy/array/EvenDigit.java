package easy.array;//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

/**
 * Input: nums = [12,345,2,6,7896]
 * Output: 2
 * Explanation:
 * 12 contains 2 digits (even number of digits).
 * 345 contains 3 digits (odd number of digits).
 * 2 contains 1 digit (odd number of digits).
 * 6 contains 1 digit (odd number of digits).
 * 7896 contains 4 digits (even number of digits).
 * Therefore only 12 and 7896 contain an even number of digits
 */

public class EvenDigit {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896, 45, 55667788, -1223};
        int[] nums1 = {333, 333, 333};
        System.out.println(checkEvenDigits(nums1));
        //System.out.println(getDigit(456));

    }

    private static int checkEvenDigits(int[] nums) {
        // get the digit and count if occurance of 2 number
        int count = 0;
        for (int n : nums) {
            int i = 0;
            while (n > 0) {
                int lastDigit = n % 10;
                i++;
                n = n / 10;
            }
            if (i % 2 == 0) count++;

        }
        return count;
    }

    // optimized
    private static int checkEvenDigits2(int[] nums) {
        int count = 0;
        for (int num : nums) {
            //getDigit
            int d_count = getDigit(num);
            if (isEven(d_count)) count++;

        }
        return count;
    }

    private static boolean isEven(int d_count) {
        return d_count % 2 == 0;
    }

    private static int getDigit(int num) {
        if (num < 0) num *= -1;
        return (int) Math.log10(num) + 1;
    }
}
