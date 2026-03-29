package TwoPointers;

import java.util.Arrays;

public class TwosumIndexSoerted {
    public static int[] IndexReturn(int[] arr, int target){
        int i = 0, j = arr.length-1;

        

        while(i<j){
            int sum =arr[i] + arr[j];
            if(sum > target ){
                j--;
            } else if(sum < target){
                i++;
            }else{
                return new int[] { i + 1, j + 1 };
            }

        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int[] arr = {2,7,9,16};
        int[] result = IndexReturn(arr, 7);
        System.out.println(Arrays.toString(result));
    }
}
