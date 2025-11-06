import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
        int[] arr = {2, 8, 1, 9, 5};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println(max);
    }
}
