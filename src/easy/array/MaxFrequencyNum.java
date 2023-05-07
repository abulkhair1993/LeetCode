package easy.array;

/**
 * Find max frequency of num
 * Ex : input {1,1,2,2,3,3,3}
 * output : Number 3 is occuring 3 times
 * {2,2,2,2,2,5,5,6,6,7}
 * output
 * Number 2 is occuring 5 times
 */
public class MaxFrequencyNum {
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 3, 3, 3, 4, 4, 5, 9, 9, 9, 9, 0, 0, 0, 0, 0, 0, 0, 0};
        int count = 1;
        int maxCount = 0;
        int oldNum = 0;
        int newNum = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
                oldNum = arr[i];
            } else {
                if (count > maxCount) {
                    maxCount = count;
                    newNum = oldNum;
                }
                count = 1;
            }
        }
        if (maxCount > count) {
            System.out.println("maxCount : " + maxCount + "old Num : " + newNum);

        } else {
            System.out.println("count : " + count + "new Num : " + oldNum);
        }


    }
}
