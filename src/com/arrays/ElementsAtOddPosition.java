//Program to print the elements of an array present on an odd position
package com.arrays;

public class ElementsAtOddPosition {
    public static void main(String[] args) {
        int arr[] = {11, 22, 33, 44, 55, 66};
        System.out.println("Elements at odd position are: ");
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                System.out.println("At index " + i + " element is: " + arr[i]);
            }
        }
    }
}
