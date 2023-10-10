import java.util.Arrays;

public class challange {
    static void rearrangeArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            if (arr[left] > 0 && arr[right] < 0) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }

            else if (arr[left] < 0) {
                left++;
            }

            else if (arr[right] > 0) {
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[] inputArray = { -12, 11, -13, -5, 6, -7, 5, -3, -6 };
        rearrangeArray(inputArray);

        for (int num : inputArray) {
            System.out.print(num + " ");
        }

    }

}

// Problem statement:

// Given an unsorted array arr[] with both positive and negative elements, the
// task is to find the smallest positive number missing from the array.

// Note: You can modify the original array.

// Examples:

// Input: arr[] = {2, 3, 7, 6, 8, -1, -10, 15}
// Output: 1 using recurssion
