package com.datastructures;

public class MergeSort {
    void sort(int arr[], int l, int r)
    {
        if (l < r) {
            // Find the middle point
            int m = l + (r - l) / 2;

            // Sort first and second halves
            System.out.println("1ST " +"l = " + l + " m = "+ m + " r = " + r);
            sort(arr, l, m);
            System.out.println("2ST " +"l = " + l + " m = "+ m + " r = " + r);
            sort(arr, m + 1, r);
            System.out.println("3rd " + "l = " + l + " m = "+ m + " r = " + r);

            // Merge the sorted halves
//            merge(arr, l, m, r);
        }
    }
    public static void main(String args[])
    {
        int arr[] = { 12, 11, 13, 5, 6, 7 };

        System.out.println("Given Array");
//        printArray(arr);

        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length - 1);

        System.out.println("\nSorted array");
//        printArray(arr);
    }
}

