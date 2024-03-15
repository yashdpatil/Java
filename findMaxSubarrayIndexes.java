public class Main {
    public static void main(String[] args) {
        int[] arr1 = {2, 3, 4, 5, 6, 7, 10};
     //   int[] arr2 = {-2, -3, -4, 4, -2, -1, -3, 1, 5, -3, -4};
       // int[] arr3 = {-8, -3, -2, -4, -1};

        int[] result1 = findMaxSubarrayIndexes(arr1);
     //   int[] result2 = findMaxSubarrayIndexes(arr2);
       // int[] result3 = findMaxSubarrayIndexes(arr3);

        System.out.println("Output for arr1: " + result1[0] + " " + result1[1]); // Output: 0 6
        //System.out.println("Output for arr2: " + result2[0] + " " + result2[1]); // Output: 3 8
        //System.out.println("Output for arr3: " + result3[0] + " " + result3[1]); // Output: 4 4
    }

    public static int[] findMaxSubarrayIndexes(int[] arr) {
        int maxSum = arr[0];
        int currentMax = arr[0];
        int start = 0;
        int end = 0;
        int tempStart = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > currentMax + arr[i]) {
               currentMax = arr[i];
                tempStart = i;
            } else {
                currentMax = currentMax + arr[i];
            }

            if (currentMax > maxSum) {
                maxSum = currentMax;
                start = tempStart;
                end = i;
            }
        }

        return new int[]{start, end};
    }
}
