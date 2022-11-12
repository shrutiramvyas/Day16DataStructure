package com.datastructures;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchUsingWord {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("Words.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("Words.txt"));
        String line;
        String words[] = new String[20];
        while ((line = br.readLine()) != null) {
            words = line.split(",");
        }
        Arrays.sort(words);
        for(int i = 0; i < words.length; i++){
            System.out.println(words[i]);
        }
        System.out.println("Enter a word to search ");
        Scanner scan = new Scanner(System.in);
        String findWord = scan.nextLine();
        int result = binarySearch(words,findWord);
        if(result == -1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at Index " + (result + 1) + " position");
        }
    }
    public static int binarySearch(String words[], String findWord) {
        int high = words.length - 1;
        int low = 0;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (findWord.equals(words[mid])) {
                return mid;
            }
            if (words[mid].compareToIgnoreCase(findWord) < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
