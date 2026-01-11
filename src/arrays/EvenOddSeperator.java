package arrays;

import java.util.Arrays;

public class EvenOddSeperator {

    public static void seperateEvenOdd(int[] arr) {
        // Initialize two pointers, 'left' at the beginning and 'right' at the end.
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // Increment 'left' until an odd number is found.
            // Even numbers (arr[left] % 2 == 0) are already on the left side.
            while (left < right && arr[left] % 2 == 0) {
                left++;
            }

            // Decrement 'right' until an even number is found.
            // Odd numbers (arr[right] % 2 != 0) are already on the right side.

            while (left < right && arr[right] % 2 != 0) {
                right--;
            }

            // If an odd number is found on the left and an even number on the right,
            // and the pointers haven't crossed, swap them

            if (left < right) {
                // Swap arr[left] and arr[right]
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                // Move pointers inward after a swap
                left++;
                right--;
            }
        }
    }


    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 7, 1, 3, 6, 4, 5, 9};
        System.out.println("Original array: " + Arrays.toString(arr));
        seperateEvenOdd(arr);
        System.out.println("Array with evens left, odds right: " + Arrays.toString(arr));
    }
}
