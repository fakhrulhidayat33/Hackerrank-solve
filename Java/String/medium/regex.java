// Link: https://www.hackerrank.com/challenges/java-regex/problem?isFullScreen=true
// Language: Java 8
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Solution{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

//Write your code here
class MyRegex{
    String c = "(?![3-9]\\d{2}|2[6-9]\\d|25[6-9])(\\d{1,3})";
    String pattern = "^" + c + "\\." + c + "\\." + c + "\\." + c + "$";
}
