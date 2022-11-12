package com.datastructures;

public class Anagram {
    public static void main(String[] args) {
        String first = "eheart";
        String second = "eearth";

        if (isAnagram(first, second)) {
            System.out.println(first + " and " + second + " is Anagram to each other");
        } else {
            System.out.println(first + " and " + second + " is Not Anagram to each other");
        }
    }
        public static boolean isAnagram(String first , String second) {
            if (first.length() != second.length()) {
                return false;
            }
            char[] secondArray = second.toCharArray();
            char[] firstArray = first.toCharArray();
            sort(secondArray);
            sort(firstArray);
            for (int i = 0; i < firstArray.length; i++){
                if(firstArray[i] != secondArray[i]){
                    return false;
                }
            }
        return true;
        }
        public static void sort(char[] charArray){
             for(int i = 0; i < charArray.length - 1; i++ ){
                 for(int j = 0; j < charArray.length - 1 - i; j++){
                        if(charArray[j] > charArray[j+1]){
                            char temp = charArray[j];
                            charArray[j] = charArray[j+1];
                            charArray[j+1] = temp;
                     }
                    }
                }
            }
}
