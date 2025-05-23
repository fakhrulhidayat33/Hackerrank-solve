# Link: https://www.hackerrank.com/challenges/java-static-initializer-block/problem?isFullScreen=true
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
// I only can edit from here
private static Scanner sc = new Scanner(System.in);
private static Integer B = sc.nextInt();
private static Integer H = sc.nextInt();
private static boolean flag = true;

static {
    if (B <= 0 || H <= 0){
        flag = false;
        System.out.println("java.lang.Exception: Breadth and height must be positive");
    }
}
// until here
public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class
