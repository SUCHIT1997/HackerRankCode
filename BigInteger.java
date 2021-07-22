import java.io.*;
import java.util.*;
import java.util.Scanner;
//import java.math.BigInteger;
public class BigInteger {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        { 
         //   BigInteger p=sc.nextBigInteger();
         //   BigInteger p=new BigInteger(" .nextBigInteger")
            try{
             long p=sc.nextLong();   
            
            System.out.println(p+" can be fitted in:");
            if(Byte.MAX_VALUE>p && Byte.MIN_VALUE<p)
                System.out.println("* byte");
            if(Short.MAX_VALUE>p && Short.MIN_VALUE<p)
                System.out.println("* short");
            if(Integer.MAX_VALUE>p && Integer.MIN_VALUE<p)
                System.out.println("* int");
            if(Long.MAX_VALUE>p && Long.MIN_VALUE<p)
                System.out.println("* long");
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }
        }
        
    }
}
