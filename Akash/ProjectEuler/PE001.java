import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        
        long n;
        int i;
        long sum=0L, tf, ff, tff, ts, fs, tfs;
        int index = 0;

        while(t-- > 0) {
            sum=0L;
            n = in.nextLong();
            n -= 1L;
            tf = n/3L;
            ff = n/5L;
            tff = n/15L;
            ts = (tf*(tf+1))/2L;
            fs = (ff*(ff+1))/2L;
            tfs = (tff*(tff+1))/2L;
            sum = (ts*3L)+(fs*5L)-(tfs*15L);
            System.out.println(sum);
        }
    }
}