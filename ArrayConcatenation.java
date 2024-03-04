/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg20application;

/**
 *
 * @author uyser
 */
import java.util.Arrays;

public class ArrayConcatenation {
    public static void main(String[] args) {
        // Example arrays
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        
        // Concatenate arrays
        int[] concatenatedArray = concatenateArrays(array1, array2);
        
        // Print the concatenated array
        System.out.println("Concatenated Array: " + Arrays.toString(concatenatedArray));
    }
    
    // Static method to concatenate two arrays
    public static int[] concatenateArrays(int[] array1, int[] array2) {
        int length1 = array1.length;
        int length2 = array2.length;
        
        // Create a new array to hold the concatenated elements
        int[] concatenatedArray = new int[length1 + length2];
        
        // Copy elements of array1 to concatenatedArray
        for (int i = 0; i < length1; i++) {
            concatenatedArray[i] = array1[i];
        }
        
        // Copy elements of array2 to concatenatedArray
        for (int i = 0; i < length2; i++) {
            concatenatedArray[length1 + i] = array2[i];
        }
        
        return concatenatedArray;
    }
}
