import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        
        int a, b, temp;
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();

        temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a + " b = " + b);
    }
}
