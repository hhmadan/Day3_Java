//Program to print the elements of an array
package com.arrays;

public class PrintElementsOfArray {
    public static void main(String[] args){
        int arr[] = {10, 20, 30, 40, 50};

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        /* using for-each loop
        for(int val : arr){
            System.out.println(val+ " ");
        }*/

    }
}
