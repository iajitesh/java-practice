package Arrays;

public class ReverseArray {
    public static void reverse(int arr[]) {
        int P1 = 0, P2 = arr.length - 1;
        while (P1 < P2) {
            int temp = arr[P1];
            arr[P1] = arr[P2];
            arr[P2] = temp;

            P1++;
            P2--;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 5, 7, 9, 10 };

        reverse(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
