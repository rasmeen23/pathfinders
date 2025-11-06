import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        System.out.print("Enter a string:");
        String rev = new StringBuilder(s).reverse().toString();
        if (s.equals(rev))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
