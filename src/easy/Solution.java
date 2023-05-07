package easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Solution {

    final class Test {
        int i;
        String str;

        public Test(int i, String str) {
            this.i = i;
            this.str = str;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Test test = (Test) o;
            return i == test.i && str.equals(test.str);
        }

        @Override
        public int hashCode() {
            return Objects.hash(i, str);
        }

        @Override
        public String toString() {
            return "Test{" +
                    "i=" + i +
                    ", str='" + str + '\'' +
                    '}';
        }
    }

    public void construct() {
        Test t = new Test(1, "Abul");
        Test t2 = new Test(2, "Khair");
        Test t3 = new Test(2, "Khair");
        Test t4 = new Test(2, "khair");
        Map<Test, Integer> map = new HashMap<>();
        map.put(t, 1);
        map.put(t2, 2);
        map.put(t3, 2);
        map.put(t4, 2);
        System.out.println(map);

    }

    public static void main(String[] args) {
        String str= new String();
        System.out.println(str.length());
        //Solution s = new Solution();
        //s.construct();


        int[] nums = {1, 2, 3, 4, 5};
        int count = 0;
        /*for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[count++]);
        }*/

        //System.out.println(removeElement( nums, 3));
        //System.out.println(Arrays.toString(nums));

    }

    public static int removeElement(int[] nums, int val) {

        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count++] = nums[i];
            }
        }

        return count;

    }
}