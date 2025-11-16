public class RemovesDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,4,5};
        int[] res = new int[arr.length];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean dup = false;
            for (int j = 0; j < k; j++)
                if (arr[i] == res[j]) dup = true;

            if (!dup) res[k++] = arr[i];
        }

        for (int i = 0; i < k; i++)
            System.out.print(res[i] + " ");
    }
}
