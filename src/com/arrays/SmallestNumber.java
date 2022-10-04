// Program to print the smallest element in an array
package com.arrays;
import java.util.Scanner;
public class SmallestNumber {
    public static int getSmallest(int[] a){
        int temp;
        for (int i = 0; i < a.length; i++){
            for (int j = i + 1; j < a.length; j++){
                if (a[i] <  a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[a.length-1];
    }
    public static void main(String args[]){
        int [] a=new int[5];
        int i;
        System.out.println("Enter "+ a.length+" values to be stored in Array: ");
        Scanner sc = new Scanner(System.in);
        for(i=0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        for(i=0; i<a.length;i++){
            System.out.println(a[i]);
        }
        System.out.println("Smallest Element in array: "+getSmallest(a));

    }
}
