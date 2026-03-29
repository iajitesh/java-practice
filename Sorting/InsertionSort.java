package Sorting;

// Time complexity is O(n^2)
public class InsertionSort {
    public static void DoInsertion(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int prev = i - 1;

            while (prev >= 0 && arr[prev] > current) {
                arr[prev + 1] = arr[prev];
                prev--;

            }
            arr[prev + 1] = current;

        }

    }

    public static void PrintArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 10, 8, 7 };
        DoInsertion(arr);
        PrintArr(arr);
    }

}
