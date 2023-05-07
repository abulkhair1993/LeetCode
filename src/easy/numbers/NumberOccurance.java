package easy.numbers;

/*
given number 123123 find the total number of occurance of 3
out put should be 2
input 44456
how many times 4 occured?
output 3

 */
public class NumberOccurance {

    public static void main(String[] args) {
        int input = 112233;
        int target = 3;
        int count = 0;
        while (input > 0) {
            int lastNum = input % 10;
            if (lastNum == target) count++;
            input = input / 10;

        }
        System.out.println(count);

    }


}
