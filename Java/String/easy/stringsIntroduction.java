// Link: https://www.hackerrank.com/challenges/java-strings-introduction/problem?isFullScreen=true
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        sc.close();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length() + B.length());
        System.out.println(A.compareTo(B) > 0? "Yes": "No");
        System.out.print(A.substring(0, 1).toUpperCase() + A.substring(1));
        System.out.print(" ");
        System.out.println(B.substring(0, 1).toUpperCase() + B.substring(1));
    }
}
