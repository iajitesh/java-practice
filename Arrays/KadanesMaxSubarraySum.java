package Arrays;
// Kadanes Algo is used (if num is negative make it zero)
// Time complexity of this code is O(n)
// This code also works for if all elements are negative
public class KadanesMaxSubarraySum {
    public static void KadanesSum(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int CurrentSum = 0;
        int maxElement = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            maxElement = Math.max(maxElement, arr[i]); //for all negative
            CurrentSum += arr[i];
            if(CurrentSum < 0){
                CurrentSum = 0;
            }
        maxSum = Math.max(maxSum, CurrentSum);

        if(maxSum == 0){
            maxSum = maxElement;
        }
        
        }
        System.out.println("Maximum Subarray Sum is: "+ maxSum);

    }
    public static void main(String[] args) {
        int[] arr = {-2,-3,4,-1,-2,1,5,-3};
        int[] arr2 = {-6,-2,-3,-5};
        KadanesSum(arr2);
    }
}
