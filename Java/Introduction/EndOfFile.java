\\ Link: https://www.hackerrank.com/challenges/java-end-of-file/problem?isFullScreen=true
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t = 1;
        while (sc.hasNext()){
            System.out.printf("%d ", t);
            System.out.println(sc.nextLine());
            t += 1;
        }
        sc.close();
    }
}
