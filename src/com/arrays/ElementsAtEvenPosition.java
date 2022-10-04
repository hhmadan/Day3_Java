//Program to print the elements of an array present on an even position
package com.arrays;
public class ElementsAtEvenPosition {
    public static void main(String[] args) {
        int arr[] = {11, 22, 33, 44, 55, 66};
        System.out.println("Elements at even position are: ");
        for (int i = 0; i<arr.length; i++){
            if (i%2==0){
                System.out.println("At index "+i+" element is: "+arr[i]);
            }
            // for (int i = 0; i<arr.length; i+=2){
            // System.out.println("At index "+i+" element is: "+arr[i]);
            // }
        }
    }
}
