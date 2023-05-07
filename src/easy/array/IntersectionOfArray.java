package easy.array;

import java.util.*;

/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/674/
 * Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must
 * appear as many times as it shows in both arrays and you may return the result in any order.
 * <p>
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2,2]
 * Example 2:
 * <p>
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * Output: [4,9]
 * Explanation: [9,4] is also accepted.
 */
public class IntersectionOfArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        //System.out.println(Arrays.toString(bruteForceApproach(nums1, nums2)));
        //System.out.println(solution2(nums1, nums2));
        //System.out.println(Arrays.toString(solution3(nums1, nums2)));
        System.out.println(Arrays.toString(intersect(nums1, nums2)));

    }

    public static int[] intersectionOptimized(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        int i = 0, j = 0;
        //Sort the array
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] > nums2[j]) {
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                list.add(nums1[i]);
                i++;
                j++;

            }
        }
        if (list.size() > 0) {
            int[] intArray = new int[list.size()];
            i = 0;
            for (; i < list.size(); i++)
                intArray[i] = list.get(i);
            return intArray;
        }
        return new int[]{};
    }

    // more optimized
    public static int[] intersect(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int res[] = new int[n * m];
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0, k = 0;
        while (i < n && j < m) {
            if (nums1[i] > nums2[j]) {
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                res[k++] = nums1[i++];
                j++;
            }
        }
        return Arrays.copyOfRange(res, 0, k);
    }

    public static int[] bruteForceApproach(int[] nums1, int[] nums2) {
        int[] arr = {};
        List<Integer> list = new ArrayList();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    list.add(nums2[j]);
                    break;
                }
            }
        }
        if (list.size() > 0) {
            arr = new int[list.size()];
            int i = 0;
            for (int n : list) {
                arr[i] = n;
                i++;
            }
        }

        return arr;
    }

    /**
     * Using binary search and sorting
     */
    public static List<Integer> solution2(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums2);
        for (int i = 0; i < nums1.length; i++) {
            if (binarySearch(nums2, nums1[i]) != -1) {
                list.add(nums1[i]);
            }
        }
        return list;

    }

    public static int binarySearch(int[] arr, int target) {
        int s = 0;
        int e = arr.length;
        while (s < e) {
            int mid = (0 + arr.length) / 2;

            if (arr[mid] == target) {
                return arr[mid];
            } else if (target > arr[mid]) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return -1;
    }

    /**
     * Using hashing technique
     */

    public static int[] solution3(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> hs = new HashSet<>();
        Set<Integer> hs2 = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {
            hs.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            hs2.add(nums2[i]);
        }
        Iterator<Integer> it = hs.iterator();
        while (it.hasNext()) {
            Integer i = it.next();
            if (hs2.contains(i)) {
                list.add(i);
            }
        }

        if (list.size() > 0) {
            int[] arr = new int[list.size()];
            int i = 0;
            for (int n : list) {
                arr[i] = n;
                i++;
            }
            return arr;
        }
        return new int[0];
    }

}
