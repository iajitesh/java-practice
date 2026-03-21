package Patterns;

import java.util.Scanner;

public class HollowFull {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            
            for (int j = i; j < 5; j++) {
                System.out.print(" ");
            }

           
            for (int k = 1; k <= i; k++) {
           
                if (k == 1 || k == i || i == 5) {
                    System.out.print(k + " ");
                } else {
                
                    System.out.print("  ");
                }
            }
        
            System.out.println();
        }
        sc.close();
    }
}