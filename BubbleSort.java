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

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {14, 94, 55, 12, 22, 11, 90};

        System.out.println("Original Array: " + Arrays.toString(array));

        bubbleSort(array);

        System.out.println("Sorted Array: " + Arrays.toString(array));
    }

    // Static method to perform bubble sort
    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j+1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
