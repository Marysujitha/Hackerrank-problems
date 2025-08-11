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
        int i;
        int k=s.nextInt();
        for(i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
      
        if(k>n || k<=0){
            System.out.println("Out of Range");
        return;}
          Arrays.sort(a);
          System.out.println(a[k - 1]);
    }
}

      



