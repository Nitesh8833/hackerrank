/*
    A Very Big Sum 
    Solution for hackerrank challenge
    Language : Java
    Author : Jan Helmle
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] arr = new long[n];
        long sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
