package easy.string;

/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/885/
 * Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: haystack = "sadbutsad", needle = "sad"
 * Output: 0
 * Explanation: "sad" occurs at index 0 and 6.
 * The first occurrence is at index 0, so we return 0.
 * Example 2:
 * <p>
 * Input: haystack = "leetcode", needle = "leeto"
 * Output: -1
 * Explanation: "leeto" did not occur in "leetcode", so we return -1.
 */

public class StrstrImpl {
    public static void main(String[] args) {

        System.out.println(strStr3("budsad","sad"));

    }

    public static int strStr(String haystack, String needle) {
        if (haystack.length() == 0 || needle.length() == 0) {
            return -1;
        }

        if (needle.length() > haystack.length()) {
            return -1;
        }
        for (int currentIndex = 0; currentIndex < haystack.length() - needle.length() + 1; currentIndex++) {
            if (haystack.charAt(currentIndex) == needle.charAt(0)) {
                if (haystack.substring(currentIndex, needle.length() + currentIndex).equals(needle)) {
                    return currentIndex;
                }
            }
        }
        return -1;
    }

    public static int strStr2(String haystack, String needle) {

        int occ = 0;

        for(int i=0;i<haystack.length()-1;i++){

            occ =  haystack.indexOf(needle);


        }
        return occ;
    }


    public static int strStr3(String haystack, String needle) {

        int n = needle.length();
        int m = haystack.length();

        if (n > m)return -1;

        int j = 0;
        int i = 0;

        while ( j < m) {

            if (haystack.charAt(j) == needle.charAt(i)) {

                i++;
                j++;

                if (i == n)return j - n;

                continue;
            }
            else {
                if (i != 0) {
                    j = j - i + 1;
                    i = 0;
                }
                else {
                    j++;
                }
            }
        }

        return -1;

    }

}
