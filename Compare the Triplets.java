/*
    Compare the Triplets 
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
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int aout = 0;
        int bout = 0;
        if (a0 < b0) {
            bout++;
        }
        if (a0 > b0) {
            aout++;
        }
        if (a1 < b1) {
            bout++;
        }
        if (a1 > b1) {
            aout++;
        }
        if (a2 < b2) {
            bout++;
        }
        if (a2 > b2) {
            aout++;
        }
        System.out.println(aout + " " + bout);
    }
}
