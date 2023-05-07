package challenge;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://github.com/code-flu/competitive-programming-solutions/tree/main/techgig/17_phobia
 */

public class Number17Phobia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            String ans =  (n % 17 == 0)?"Panic Attack":(String.valueOf(n).contains("17")?"Panic Attack":"Happy Face");
            System.out.println(ans);
            --t;
        }
    }
}
