//Program to print the elements of an array in reverse order
package com.arrays;
import java.util.Scanner;
public class ReverseOrderArray {
    public static void main(String[] args) {
        int arr[]=new int[5];
        int i;
        System.out.println("Enter elements in Array");
        Scanner sc = new Scanner(System.in);
        for(i=0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Reverse order array element are");
        for(i= arr.length-1; i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}
