/*
    Fibonacci Modified 
    Solution for hackerrank challenge
    Language : Java
    Author : Jan Helmle
 */
import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t1 = in.nextInt();
        int t2 = in.nextInt();
        int n = in.nextInt();
        java.math.BigInteger[] arr = new java.math.BigInteger[n];
        arr[0] = BigInteger.valueOf(t1);
        arr[1] = BigInteger.valueOf(t2);
        for (int i = 2; i < n; i++) {
            arr[i] = arr[i - 2].add(arr[i - 1].pow(2));
        }
        System.out.println(arr[n - 1]);
    }
}
