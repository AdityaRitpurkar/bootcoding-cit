package Array;

public class ArrayEx1 {
    public static void main(String[] args) {

        int[] temp;
        int[] arr = {5, 9, 15, 2, 8};
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }

        }
    }
}
