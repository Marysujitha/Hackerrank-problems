import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        double m=(double)a/b ;
        int d=a%b;
        System.out.printf("%d / %d = %.6f\n",a,b,m);
        System.out.println(a+" % "+b+" = "+d);
    }
}
