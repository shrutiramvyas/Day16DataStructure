package com.datastructures;

import java.util.ArrayList;

public class Values {
    public static void main(String[] args) {
        char[] arr = {'a', 'B', 'c', '0', 'D', 'E', '0', 'o', 'g', 'f', '0'};
        extract(arr);
    }
    public static void extract(char arr[]){
        int n = arr.length;
        ArrayList newArr = new ArrayList();
        for( int i = 0; i < n; i++){
            if(arr[i] != '0'){
                newArr.add(arr[i]);
            }
        }
        for(Object array : newArr){
            System.out.println(array);
        }
    }

}
