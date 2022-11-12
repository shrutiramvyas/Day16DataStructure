package com.datastructures;

import java.util.Scanner;

public class BinarySearchSimple {
    int binarySearch(int arr[], int x) {
        int high = arr.length - 1;
        int low = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (x == arr[mid]) {
                return mid;
            }
            if (x > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
            return -1;
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 40, 50, 60, 80, 110, 120, 130, 140};
        int x = 20;
        BinarySearchSimple bs = new BinarySearchSimple();
        int result = bs.binarySearch(arr, x);
        if(result == -1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at " + result + "th position");
        }
    }
}
