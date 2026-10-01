import java.util.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {

        double price, discountedPrice, finalPrice;
        Scanner sc = new Scanner(System.in);

        price = sc.nextDouble();

        discountedPrice = price - 0.1 * price;
        finalPrice = discountedPrice + 0.18 * discountedPrice;

        System.out.println(finalPrice);
    }
}
