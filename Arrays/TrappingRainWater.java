package Arrays;
//Time complexity hai O(3n) or O(n) kyunki 3 baar array scan ho rha for loop se

// Aur space complexity hai O(n) kyunki ek baar store kara rhe hai 3rd loop mai.

public class TrappingRainWater {
    public static int TrappedWater(int[] height) {
        int n = height.length;
        if (n == 0) {
            return 0;
        }

        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        leftMax[0] = height[0];
        rightMax[n - 1] = height[n - 1];

        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);// left ka maximum, height mtlb jis index pr khade hai vo
        }
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        int Totalwater = 0;
        for (int i = 0; i < n; i++) {
            Totalwater += Math.min(leftMax[i], rightMax[i]) - height[i];// left aur right ka jo minimum hoga usme se jahan khade ho uski height hata do utha hi paani store hoga
        }

        return Totalwater;

    }

    public static void main(String[] args) {
        int[] height = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        System.out.println("Trapped Water = " + TrappedWater(height) + " units");
    }
}
