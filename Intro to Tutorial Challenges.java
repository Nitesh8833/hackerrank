/*
    Intro to Tutorial Challenges
    Solution for hackerrank challenge
    Language : Java
    Author : Jan Helmle
 */
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int v = in.nextInt();
        int q = in.nextInt();
        int a[] = new int[q];
        for (int a_i = 0; a_i < q; a_i++) {
            a[a_i] = in.nextInt();
        }
        // System.out.println(a[0]);
        for (int i = 0; i < q; i++) {
            if (a[i] == v) {
                System.out.println(i);
                break;
            }
        }
    }
}
