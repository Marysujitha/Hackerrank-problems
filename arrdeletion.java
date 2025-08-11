import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        int size=s.nextInt();
        int a[]=new int[size];
        int i,data,pos=-1;
        for(i=0;i<size;i++)
        {
            a[i]=s.nextInt();
        }
        pos=s.nextInt();
        if(pos < 1 || pos > size)
             System.out.println("Deletion not possible.");
        else{
                for(i=pos-1;i<size-1;i++)
               a[i]=a[i+1]; 
        
            for(i=0;i<size-1;i++)
               System.out.print(a[i]+" ");
        }
    }
}
