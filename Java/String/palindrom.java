// Link: https://www.hackerrank.com/challenges/java-string-reverse/problem?isFullScreen=true

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();

        sc.close();
        // I paraphrase code in "https://www.geeksforgeeks.org/reverse-a-string-in-java/"
        // from this
        String r = "";
        char ch;

        for (int i = 0; i < A.length(); i++) {
              
              // extracts each character
            ch = A.charAt(i);
          
              // adds each character in
            // front of the existing string
            r = ch + r; 
        }
        // Until this
        
        System.out.println(A.compareTo(r) == 0? "Yes" : "No");
    }
}
