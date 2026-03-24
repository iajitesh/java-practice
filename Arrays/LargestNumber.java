package Arrays;

public class LargestNumber {
    public static int LargestofArr(int arr[]){
        int largest = Integer.MIN_VALUE; //-infinity
        int smallest = Integer.MAX_VALUE; //+infinity

        for(int i=0; i<arr.length; i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
            if(arr[i]<smallest){
                smallest = arr[i];
            }
        }
        System.out.println("Smallest is: "+smallest);
        return largest;
        
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};

        int largest = LargestofArr(arr);
        System.out.println("Largest is: "+largest);
    
    }
    
}
