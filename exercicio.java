exercicio 1

  public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Print output to STDOUT. Your class should be named Solution. */
         System.out.println("Hello, World.");
         System.out.println("Hello, Java.");
    }
}

exercicio 2
  
public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    
    
    }
}

exercicio 3

  
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
    
        scanner.close();
        
     if (N % 2 != 0){
        System.out.println("Weird");
     } else {
        if (N >= 2 && N <= 5){
            System.out.println("Not Weird");
        } else if (N >= 6 && N <= 20){
            System.out.println("Weird");
        } else{
            System.out.println("Not Weird");
        }
     }
    }
}


exercicio 4

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}

exercicio 5

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                 System.out.printf("%-15s%03d%n", s1, x);
            }
            System.out.println("================================");
            sc.close();
    }
}

exercicio 6


import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
        for(int i = 1; i<= 10; i++){
             System.out.println(N + " x " + i + " = " + (N * i));
        }
    }
}

exercicio 7
  
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            int sum = a; 

            for (int j = 0; j < n; j++) {
                sum += (int) Math.pow(2, j) * b;
                System.out.print(sum + " "); 
            }
            System.out.println(); 
        }
        in.close(); 
    }
    }

exercicio 8

import java.io.*;

class Solution {
    public static void main(String []argh) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            try {
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");

                if (x >= -128 && x <= 127) {
                    System.out.println("* byte");
                }

                if (x >= -32768 && x <= 32767) {
                    System.out.println("* short");
                }

                if (x >= -2147483648 && x <= 2147483647) {
                    System.out.println("* int");
                }

                if (x >= -9223372036854775808L && x <= 9223372036854775807L) {
                    System.out.println("* long");
                }

            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }

        sc.close(); 
    }
}

exercicio 9

import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       
    Scanner sc = new Scanner(System.in);
    int lineNumber = 1;
    
     while (sc.hasNextLine()) {
        
    String line = sc.nextLine();
     
     System.out.println(lineNumber + " " + line);
            
            lineNumber++;
        }
        
        sc.close();
    }
}

exercicio 10

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int B;
    static int H;
    static boolean flag = true;

    static {
        Scanner scanner = new Scanner(System.in);
        B = scanner.nextInt();  
        H = scanner.nextInt();  
        if (B <= 0 || H <= 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            flag = false; 
        }
    }

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
	}
}


