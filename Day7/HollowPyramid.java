public class HollowPyramid {
    public static void main(String[] args) {
        int n = 5; 

        for (int i = 1; i <= n; i++) {

            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }

             System.out.print("*");

            if (i > 1 && i < n) {
               
                for (int s = 1; s <= (2*i - 3); s++) {
                    System.out.print(" ");
                }
                
                System.out.print("*");
            }

     
            if (i == n) {
                for (int s = 1; s <= (2*n - 2); s++) {
                    System.out.print("*");
                }
            }

            System.out.println();
        }
    }
}
