import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        int b=sc.nextInt();
         if (a > 0 && b > 0) {
            for (int i = a; i <= b; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
        } else {
            System.out.println("Invalid input: Numbers should be greater than 0.");
        }
    }
}
