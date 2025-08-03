import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n,r,space,star;
        n=sc.nextInt();
        for(r=1;r<=n;r++)
        {
            for(space=1;space<=n-r;space++)
                System.out.print(" ");
            for(star=1;star<=2*r-1;star++)
                System.out.print("*");
             System.out.println();
        }
    }
}
