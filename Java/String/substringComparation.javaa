// Link: https://www.hackerrank.com/challenges/java-string-compare/problem?isFullScreen=true
import java.util.Scanner;

public class Solution {

    // start edit
    public static String getSmallestAndLargest(String s, int k) {
        // define variable and set the first value
        String smallest = "", largest = ""; boolean start = true;
        // do loop if the string has more than k characters
        for (int i = 0; i < s.length() - k + 1; i++){
            // take the substring
            String word = s.substring(i, i + k);
            /* I set this method
             1) Set "smallest" and "largest" variables using the first substring
             2) Update the smallest and largest using the compareTo function.
             Do step 2 until the last substring.
            */
            if (start){smallest = largest = word; start = false;}
            else if (smallest.compareTo(word) > 0){smallest = word;}
            else if (largest.compareTo(word) < 0) {largest = word;}
        }
        return smallest + "\n" + largest;
    }
    // stop edit

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
