// link: https://www.hackerrank.com/challenges/java-anagrams/problem?isFullScreen=true

import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // I start editing from here
        String a1 = a.toLowerCase();
        String b1 = b.toLowerCase();
        if (a1.length() != b1.length()){return false;}
        else {
            Integer hasil1, hasil2;
            String cek;
            int n = a1.length();
            // check based on the first character
            while (n != 0){
                hasil1 = hasil2 = 0;
                cek = a1.substring(0,1);
                // It's time to calculate the first character of the a1 in a1 and b1
                for (int i = 0 ; i < n ; i++){
                    if (cek.equals(a1.substring(i,i+1))){hasil1 += 1;}
                    if (cek.equals(b1.substring(i,i+1))){hasil2 += 1;}
                }
                if (hasil1 != hasil2){return false;}
                else{
                    a1 = a1.replaceAll(cek,"");
                    b1 = b1.replaceAll(cek,"");
                    n = n - hasil1;
                }
            }
            return true;
        }
    }
    // until here

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
