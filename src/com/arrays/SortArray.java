//Program to sort the elements of an array in ascending order
package com.arrays;
//import java.util.Arrays;
public class SortArray {
    public static void main(String[] args) {
        int temp;
        int a[] = {5, 4, 3, 22, 16};
        System.out.println("Sorted Array in Ascending order...");
            for (int i = 0; i < a.length; i++) {
                for (int j = i + 1; j < a.length; j++) {
                    if (a[i] > a[j]) {
                        temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }
                }System.out.println(a[i]);
            }
           }
    }
//Using Array.sort();
//        Arrays.sort(a);
//        for(int i = 0;i<a.length;i++){
//          System.out.println(a[i]);
//       }