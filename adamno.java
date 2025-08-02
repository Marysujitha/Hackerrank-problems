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
        int sq,ld,rd,rev=0,sq2,rev2=0;
        sq=n*n;
        while(n>0)
        {
            ld=n%10;
            n=n/10;
            rev=rev*10+ld;//21
        }
        sq2=rev*rev;//441
        while(sq2>0)
        {
            rd=sq2%10;
            sq2=sq2/10;
             // System.out.println(sq2);
            rev2=rev2*10+rd;
             // System.out.println(rev2);
        }
        if(sq==rev2)
            System.out.println("Adam Number");
        else 
            System.out.println("Not a adam number");
    }
}
