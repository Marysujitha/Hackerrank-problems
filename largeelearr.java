import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        int i,j,count=0;
        for(i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        int max=a[0];
         for(i=1;i<n;i++)
        {
                if(a[i]>max)
                    max=a[i];
                else
                    count++;
            }
        
             System.out.print(max);
        } 
}

