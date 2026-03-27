package Arrays;

// Time complexity O(n^3) since, 3 nested loop upto n This is the brute force solution
public class SubArray {
    public static void PrintSubarray(int arr[]) {
        int ts = 0;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                int sum = 0;

                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                    sum += arr[k];
                }

                System.out.println("-> Sum = " + sum);

                // Update max and min
                if (sum > maxSum)
                    maxSum = sum;
                if (sum < minSum)
                    minSum = sum;

                ts++;
            }
            System.out.println();
        }

        System.out.println("Total Subarrays : " + ts);
        System.out.println("Maximum Subarray Sum : " + maxSum);
        System.out.println("Minimum Subarray Sum : " + minSum);
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10 };
        PrintSubarray(arr);
    }
}