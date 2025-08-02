import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        long n,ld,sum=0,count=0,power=1;
        n=sc.nextInt();
        long copy=n;
        while(n>0)
        {
            count++;
            n=n/10;
        }
        n=copy;
        while(n>0)
        {
            ld=n%10;
            n=n/10;
            power=1;
            for(long i=1;i<=count;i++)
            {
                power=power*ld;
            }
            sum+=power;
        }
            if(copy==sum)
               System.out.println("Armstrong number");
            else
               System.out.println("Not an Armstrong number"); 
    }
}
