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
        int i;
        if(a<b)
            i=a;
        else
            i=b;
        for(i=i;i>0;i--){
            if(a%i==0 && b%i==0)
            {
                System.out.println("GCD of two number is "+i);
                break;
            }
     
        }
    }
}
