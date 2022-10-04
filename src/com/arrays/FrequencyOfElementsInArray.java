//Program to find the frequency of each element in the array
package com.arrays;
import java.util.Arrays;
public class FrequencyOfElementsInArray {
    public static void main(String[] args){
            int[] arr = {9, 9, 4, 2, 1};
            int size = arr.length;
            countFrequency(arr, size);
        }
        static void countFrequency(int[] arr, int size)
        {
            Arrays.sort(arr);

            for (int i = 0; i < size; i++)
            {
                int count = 1;

                while (i < size - 1 && arr[i] == arr[i + 1]) {
                    i++;
                    count++;
                }

                System.out.println(arr[i] + "... " + count+ " times");
                count++;
            }
        }
}
