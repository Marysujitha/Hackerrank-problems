import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner =new Scanner(System.in);
        String timeString =scanner.next();
        String[] t=timeString.split(":");
        int h=Integer.parseInt(t[0]);
        int m=Integer.parseInt(t[1]);
        int s=Integer.parseInt(t[2]);
        if(h>=0 && h<24 && m>=0 && m<60 && s>=0 && s<60)
            System.out.println("Valid");
        else
            System.out.println("Not Valid");
    }
}
