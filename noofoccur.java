import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int digit=sc.nextInt();
        int count=0,a;
        while(n>0)
        {
            a=n%10;
            if(a==digit)
            {
                count++;
            }
            n=n/10;
        }
        System.out.print(count);
    }
}
