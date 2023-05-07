package easy.string;

public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }

    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase().trim();
        if (s.equals("")) {
            return true;
        }

        int last = s.length() - 1;
        int i = 0;
        while (i <= s.length() / 2) {
            if (s.charAt(i) != s.charAt(last)) {
                return false;
            }
            i++;
            last--;

        }
        return true;
    }
}
