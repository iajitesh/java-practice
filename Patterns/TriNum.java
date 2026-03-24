package Patterns;

public class TriNum {
     public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {

            // spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i || i == n) {
                    System.out.print(j + " ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}

