package Arrays;

public class BinarySearch {
    public static int BinarySearch(int arr[], int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] < key) { // right
                low = mid + 1;
            } else { // left
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 6, 7, 8, 9, 11 };
        int key = 7;
        System.out.println("Index of key is: " + BinarySearch(arr, key));
    }
}
