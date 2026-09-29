import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        
        boolean lightOn;
        Scanner sc = new Scanner(System.in);

        lightOn = sc.nextBoolean();

        System.out.println(lightOn ? "On" : "Off");

        lightOn = !lightOn;

        System.out.println(lightOn ? "On" : "Off");
    }
}
