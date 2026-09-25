import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int days, ageY, ageD;

        days = sc.nextInt();

        ageY = days / 365;
        ageD = days % 365;

        System.out.println(ageY + " Years " + ageD + " Days");
    }
}
