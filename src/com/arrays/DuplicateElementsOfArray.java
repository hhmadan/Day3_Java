//Program to print the duplicate elements of an array
package com.arrays;
public class DuplicateElementsOfArray {
    public static void main(String[] args) {
        int arr []={9, 7, 4, 2, 7, 2};
        int i, j;

        for(i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println("Duplicate elements are ...");
        for(i=0; i<arr.length; i++){
            for(j=i+1; j<arr.length; j++){
                if (arr[i]==arr[j])
                    System.out.println(arr[i]);
            }
        }
    }
}
