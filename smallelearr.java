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
        int min;
        for( int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
         min=a[0];
        for(int i=1;i<n;i++)
        {
            if(a[i]<min)
                min=a[i];
        }
        
                System.out.print(min);
        }
        
}
