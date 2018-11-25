import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        long i=2L;
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            
            i=2L;
            long root = (long)Math.sqrt(n);
            
            while(n%2L == 0L) {
                n /= i;
            }
            long dup = n;
            if(n==1) {
                System.out.println(2);
                continue;
            }
            i=3L;
            while((i<=root) && (n>1)) {
                
                while(n%i == 0L) {
                    n /= i;
                    dup=n;
                }
                i+=2L;
            }
            if(n==1) System.out.println(i-2);
            else System.out.println(dup);
        }
    }
}