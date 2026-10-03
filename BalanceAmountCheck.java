import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {

        // your code goes here
        int balance, amount;

        Scanner sc = new Scanner(System.in);

        balance = sc.nextInt();
        amount = sc.nextInt();

        System.out.println(amount >= 0 && amount <= balance);
    }
}
