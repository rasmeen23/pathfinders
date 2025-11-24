public class AlphabetPyramid {
    public static void main(String[] args) {
        int n = 5; 

        for (int i = 1; i <= n; i++) {

            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print((char)('A' + j));
            }

            for (int j = i - 2; j >= 0; j--) {
                System.out.print((char)('A' + j));
            }

            System.out.println();
        }
    }
}
