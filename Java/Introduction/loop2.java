// link: https://www.hackerrank.com/challenges/java-loops/problem?isFullScreen=true
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            for (int k = 0; k < n; k++){
                a = a + b;
                b = 2 * b;
                System.out.print(a);
                System.out.print(" ");
            }
            System.out.println();
        }
        in.close();
    }
}
