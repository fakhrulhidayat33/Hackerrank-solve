// Link: https://www.hackerrank.com/challenges/java-date-and-time/problem?isFullScreen=true
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
// I start editing from here
class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        Integer i1 = year - 2001;
        Integer i2 = i1 / 4;
        Integer i3 = i1/100;
        Integer i4 = i1/400;
        Integer b2;
        if (year % 4 == 0 && year % 100 != 0){b2 = 29;}
        else {b2 = 28;}
        Integer [] b = {31, b2, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Integer b1 = 0;
        for (int i = 1; i < month; i++){
            //System.out.println("masuk");
            b1 += b[i-1];
        }
        String[] days = {
            "SUNDAY",
            "MONDAY",
            "TUESDAY",
            "WEDNESDAY",
            "THURSDAY",
            "FRIDAY",
            "SATURDAY"
        };
        Integer d = (i1 + i2 - i3 + i4 + b1 + day) % 7;
        return days[d];
        }
    }
// until here
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
