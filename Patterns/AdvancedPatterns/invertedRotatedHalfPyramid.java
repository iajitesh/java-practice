package Patterns.AdvancedPatterns;
/*  *
   **
  ***
 ****
*****  */

public class invertedRotatedHalfPyramid {
    public static void invertedRHpyramid(int n) {
        for (int i = 1; i <= n; i++) { // for number of lines
            for (int j = 1; j <= n - i; j++) { // for spaces
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) { // for stars
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        invertedRHpyramid(5);
    }
}
