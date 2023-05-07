package easy.array;

public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] num = {1, 1, 3};
        secondLargeNum(num);

    }

    public static int secondLargeNum(int num[]) {
        if (num.length < 2) {
            System.out.println("There should be atleast two numbers");
            return -1;
        }
        // find max element
        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < num.length; i++) {
            max = Integer.max(max, num[i]);
        }

        for (int i = 0; i < num.length; i++) {
            if (num[i] != max) {
                second = Integer.max(second, num[i]);
            }
        }
        if (second == Integer.MIN_VALUE) {
            System.out.println("There is no second largest num");
            return -1;
        } else {
            System.out.println("second largest num is :" + second);

        }

        return second;
    }
}
