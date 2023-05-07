package easy.numbers;

/**
 * To identify if number is armstrong no
 * input 153
 * if sq(1)+sq(5)+sq(3) = 153
 * 1    + 125 + 27   = 153
 * return true
 */
public class ArmstrongNumber {

    public static void main(String[] args) {
        //System.out.println(isArmstrong(153));
        // System.out.println(Math.log10());


    }

    public static boolean isArmstrong(int n) {
        int sum = 0;
        int org = n;
        while (n > 0) {
            int lastDigit = n % 10;
            sum += Math.pow(lastDigit, 3);
            n = n / 10;
        }

        return sum == org;
    }
}
