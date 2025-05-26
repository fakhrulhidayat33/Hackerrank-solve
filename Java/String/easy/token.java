// Link: https://www.hackerrank.com/challenges/java-string-tokens/problem?isFullScreen=true

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        
        // Write your code here.
        scan.close();
        if (s.length() > 0) {
            String[] tokens = s.split("[!,?._'@\\s]+");
            System.out.println(tokens.length);
            for (String token : tokens){
                System.out.println(token);
            }
        }
        else {System.out.println(0);}
    }
}
