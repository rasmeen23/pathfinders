import java.util.*;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        while (n >= 10) {
            long s = 0;
            while (n > 0) {
                s += n % 10;
                n /= 10;
            }
            n = s;
        }
        System.out.println(n);
    }
}

