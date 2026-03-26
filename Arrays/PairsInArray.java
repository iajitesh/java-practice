package Arrays;
// time complexity O(n^2)
public class PairsInArray {
    public static void printpairs(int arr[]){
        int tp =0;
        for(int i=0; i < arr.length; i++){
            int current = arr[i];
            for(int j = i+1; j < arr.length; j++){
                 System.out.print("("+ current + ","+ arr[j]+ ")");
                 tp++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs = "+ tp); //tp = n(n-1)/2
    }
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,9,10};
        printpairs(arr);
    }
}
