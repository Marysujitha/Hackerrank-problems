import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        long n,r,c;
        n=sc.nextLong();
        long s=2*n-1;
        for(r=1;r<=s;r++)
        {
            for(c=1;c<=s;c++)
            {
                if(r==1 || r==s || c==1 || c==s || r==c || r+c==s+1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
