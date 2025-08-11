import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        long n=s.nextLong();
        long max=1;
        // long max;
        for(int i=2;i<=n;i++)
        {
            while(n%i==0){
            max=i;
                n=n/i;
        }
        }
        System.out.println(n>1? n: max);
         // System.out.println(n);
    }
}
