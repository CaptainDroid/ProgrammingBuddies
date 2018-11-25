import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        long a=1L, b=1L, c=2l, sum=0L;
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            a=1L; b=1L; c=2L;
            sum=0L;
            while(c <= n){
                sum+=c;
                a = b+c;
                b = a+c;
                c = a+b;
            }
            System.out.println(sum);
        }
    }
}