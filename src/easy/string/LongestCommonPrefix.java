package easy.string;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        //String [] strs = {"flower","flow","flight"};
        //String strs[] = {"dog","racecar","car"};
        String strs[] = {"mar","goog","zdt"};
        String result = "";
        char[] firstWord = strs[0].toCharArray();


        System.out.println(longestPrefix(strs, result, firstWord));
        System.out.println(longestCommonPrefix(strs));

    }

    private static String longestPrefix(String[] strs, String result, char[] firstWord) {
        for (int i = 0; i < firstWord.length; i++) {
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].toCharArray().length > i) {
                    if (firstWord[i] == strs[j].toCharArray()[i]) {
                        continue;
                    } else {
                        return result;
                    }
                } else {
                    return result;
                }
            }
            result += firstWord[i];
        }
        if (result.length() > 0) return result;
        return "";
    }

    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int length = strs.length;
        String first = strs[0];
        String last = strs[length - 1];

        int i = 0;
        while (i < first.length()) {
            if (first.charAt(i) != last.charAt(i)) {
                break;
            }
            i++;
        }

        return first.substring(0, i);
    }


    public static String test(String[] strs) {
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length-1];
        int i=0;
        while(i<first.length()) {
            if(first.charAt(i) != last.charAt(i)) {
                break;
            }
            i++;
        }
        return first.substring(0,i);
    }
}
