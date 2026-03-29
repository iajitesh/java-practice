package Sorting;

import java.util.*;

public class InbuiltSort {
    public static void SortWithInbuilt(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++)
            System.out.print(" " + arr[i]);
    }

    public static void SortWithInbuiltReverse(Integer arr[]) {
        Arrays.sort(arr, Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++)
            System.out.print(" " + arr[i]);
    }

    public static void main(String[] args) {
        // int[] arr = { 2, 7, 4, 6, 5, 1 };
        Integer arr[] = { 1, 5, 7, 9, 2 }; // primitive(int) pr ye reverse wala function kaam nhi krta isliye object ki
                                           // tarah Integer likha gaya hai!
        SortWithInbuiltReverse(arr);
    }
}
