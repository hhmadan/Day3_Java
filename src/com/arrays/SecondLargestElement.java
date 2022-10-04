//Program to find 2nd Largest Number in an Array
package com.arrays;
public class SecondLargestElement {
    public static void main(String args[]) {
        int arr[] = {3, 2, 0, 70, 99};
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Second largest element is " + arr[arr.length - 2]);
    }
}
