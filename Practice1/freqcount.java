import java.util.Scanner;
public class freqcount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter "+n+ " elements:");
        for(int i=0; i<n; i++){
        arr[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++){
            if (arr[i] == -1) {
                continue;
            }
            int x = arr[i];
            int count = 0;

            for(int j=0; j<n; j++){
                if (arr[j] == x) {
                    count++;
                    arr[j] = -1;
                    
                }
            }
        System.out.println("Occurence of "+x+ " is "+count);
        }
        

    }
}
