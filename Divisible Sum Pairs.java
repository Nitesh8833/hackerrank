/*
    Divisible Sum Pairs
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
        int k = in.nextInt();
        int a[] = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        int counter = 0;
        int[][] matrix = new int[100][100];
        for (int zeile = 0; zeile < n; zeile++) {
            for (int spalte = 0; spalte < n; spalte++) {
                matrix[zeile][spalte] = a[zeile] + a[spalte];
                if (((matrix[zeile][spalte] % k) == 0) && (zeile < spalte)) {
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}
