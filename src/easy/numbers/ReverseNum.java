package easy.numbers;

/*
reverse number
input 123
output 321

 */
public class ReverseNum {
    public static void main(String[] args) {
        long num = 1534236469;

        long rev = 0;

        boolean flag = false;

        if(num < 0) {
            flag = true;
            num *= -1;
        }
        while (num > 0) {
            long lastDigit = num % 10;
            rev = rev * 10 + lastDigit;
            num = num / 10;
        }


        if(flag) {
            rev *= -1;
        }

        //System.out.println(rev);

        System.out.println(reverse(1534236469));


        //System.out.println(reverse2(1534236469));
       // System.out.println(optimized(1534236469));


    }

    public static int reverse(int x) {
        int result = 0;
        int num = x;
        if(num < 0) num *= -1;
        while(num > 0) {
            int lastDigit = num % 10;
            result = result * 10 + lastDigit;
            num = num / 10;
        }
        if(result > (Integer.MAX_VALUE /10) || result < (Integer.MIN_VALUE / 10) )
            return 0;
        if(x < 0) {
            result *= -1;
            return result;
        }
        return result;
    }

    public static int reverse2(int x) {
        int reversed = 0;

        for (; x != 0; x /= 10) {
            int digit = x % 10;
            if (reversed > 0 && reversed > (Integer.MAX_VALUE - digit) / 10) {
                return 0;
            }
            if (reversed < 0 && reversed < (Integer.MIN_VALUE - digit) / 10) {
                return 0;
            }
            reversed = reversed * 10 + digit;
        }

        return reversed;
    }

    public static int optimized(int x) {

            int m=1;
            StringBuilder s=new StringBuilder(""+x);
            if(x<0){
                s.deleteCharAt(0);
                m=-1;
                System.out.println(x);
            }

            s.reverse();
            System.out.println(s.toString());
            if(Long.parseLong(s.toString())>Integer.MAX_VALUE){
                return 0;
            }
            return m*Integer.parseInt(s.toString());
        }

}