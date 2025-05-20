import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
        
        if (N % 2 == 1) {System.out.println("Weird");}
        else {
            if (N < 6) {System.out.println("Not Weird");}
            else {
                if (N < 21) {System.out.println("Weird");}
                else {System.out.println("Not Weird");}
            }
        }
    }
}
