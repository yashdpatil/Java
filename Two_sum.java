// // Java Problem

// //         TWo Sum
// The two sum problem is a common interview question, and it is a variation of the subset sum problem. There is a popular dynamic programming solution for the subset sum problem, but for the two sum problem we can actually write an algorithm that runs in O(n) time. The challenge is to find all the pairs of two integers in an unsorted array that sum up to a given S. 
// Example 1:

// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

import java.util.*;
import java.util.Collection;

public class Two_sum {
    public static void main(String[] args) {

        int[] a = { 17, 7, 11, 15, 2 };
        int target = 9;
        // for (int i = 0; i < a.length; i++) {
        // for (int j = i + 1; j < a.length; i++) {
        // if (a[i] + a[j] == target) {
        // int r[] = { i, j };
        // System.out.println(r);
        // }

        // }

        // }
        // return null;

        HashMap<Integer, Integer> h1 = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            h1.put(a[i], i);
        }
        // System.out.println(h1);
        for (int i = 0; i < a.length; i++) {
            int inti = a[i];
            int rem = target - inti;
            if (h1.containsKey(rem)) {

                int index = h1.get(rem);
                if (index == i)
                    continue;
                int[] f = { i, index };

                System.out.println(f[1]);
            }

        }

    }

}