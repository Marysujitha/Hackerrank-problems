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
        int i,j;
        for(i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
         boolean found = false;
        for(i=0;i<n;i++){
            int count=0;
            for(j=0;j<n;j++){
           if(a[i]==a[j])
            count ++;
            }
            if(count==1){
                System.out.print(a[i]+" ");
            found=true;
            }
        }
         if(!found)
        System.out.print("No unique elements in the array");
    }
}
