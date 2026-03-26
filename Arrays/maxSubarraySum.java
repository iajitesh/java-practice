package Arrays;
//This is the optimized approach using prefix sum
//Therefore time complexity of this solution is O(n^2), since two loops upto n
public class maxSubarraySum {
    public static void maxSum(int arr[]){ 
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        
        //calculate prefix array
        for(int i=1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + arr[i];  
        }

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                int sum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];

                // Update max and min
                if (sum > maxSum) maxSum = sum;
               
            }
            System.out.println();
        }
        System.out.println("Maximum Sum is: "+ maxSum);
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        maxSum(arr);
    }
}
