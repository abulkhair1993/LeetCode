package easy.numbers;

/**
 * Given an integer number n, return the difference between the product of its digits and the sum of its digits.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: n = 234
 * Output: 15
 * Explanation:
 * Product of digits = 2 * 3 * 4 = 24
 * Sum of digits = 2 + 3 + 4 = 9
 * Result = 24 - 9 = 15
 */
public class ProductAndSumOfDigit {
    public static void main(String[] args) {
        int ans = product(234) - sum(234);
        System.out.println(ans);

    }

    public static int product(int n) {
        int prod = 1;
        while (n > 0) {
            int rem = n % 10;
            prod *= rem;
            n = n / 10;
        }
        return prod;
    }

    public static int sum(int n) {
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum += rem;
            n = n / 10;
        }
        return sum;
    }
}
