package Patterns;

public class FullPyramid {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {

            for (int s = 1; s <= n - i; s++) {
                System.out.print("  ");
            }
            int num = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(num++ + " ");
            }

            num = num - 2;
            for (int j = 1; j < i; j++) {
                System.out.print(num-- + " ");
            }

            System.out.println();
        }
    }
}
