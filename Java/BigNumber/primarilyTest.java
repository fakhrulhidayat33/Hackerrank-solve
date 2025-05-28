// Link: https://www.hackerrank.com/challenges/java-primality-test/problem?isFullScreen=true
import java.io.*;
import java.math.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        int k = 8;

        bufferedReader.close();
        
        BigInteger a = new BigInteger(n);
        
        if (a.isProbablePrime(1)){System.out.println("prime");}
        else {System.out.println("not prime");}
    }
}
