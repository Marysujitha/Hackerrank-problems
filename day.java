import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a==0)
        {System.out.println("Sunday");
         }
        if(a==1)
        {System.out.println("Monday");
         }
        if(a==2)
        {System.out.println("Tuesday");
         }
        if(a==3)
        {System.out.println("Wednesday");
         }
        if(a==4)
        {System.out.println("Thursday");
         }
        if(a==5)
        {System.out.println("Friday");
         }
        if(a==6)
        {System.out.println("Saturday");
         }
        if(a>6)
        {
            System.out.println("Invalid");
        }
    }
}
