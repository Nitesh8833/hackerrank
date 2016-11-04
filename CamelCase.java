/*
    CamelCase
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
        String s = in.next();
        String[] a = s.split("[A-Z]");
        System.out.println(a.length);
    }
}
