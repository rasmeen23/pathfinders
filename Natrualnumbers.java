import java.util.Scanner;

public class Natrualnumbers{
  public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter a number:");
    int N = sc.nextInt();
    int sum = N * (N + 1) / 2;
    System.out.println("Sum of first" + N + "natural numbers is: " + sum);
    sc.close();
  }
}
    