package com.datastructures;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {12,11,13,5,6};
        insertSort(arr);
    }
    public static void insertSort(int arr[]){
        for( int i = 1; i < arr.length; i++){
            int j = i-1;
            int key = arr[i];
            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j = j - 1;
            }
            arr[j+1] = key;
        }
        System.out.println("After Insertion Sort");
        for(int i = 0; i < arr.length; i++ ){
            System.out.println(arr[i]);
        }
    }
}
