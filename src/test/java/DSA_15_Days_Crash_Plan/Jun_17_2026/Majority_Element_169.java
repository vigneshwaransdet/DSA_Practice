package DSA_15_Days_Crash_Plan.Jun_17_2026;

/*
Majority_Element_169

Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

Example 1:
Input: nums = [3,2,3]
Output: 3

Example 2:
Input: nums = [2,2,1,1,1,2,2]
Output: 2

Constraints:
n == nums.length
1 <= n <= 5 * 104
-109 <= nums[i] <= 109
The input is generated such that a majority element will exist in the array.
 */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Majority_Element_169 {

    @Test
    public void test01() {
        int[] nums = {3,2,3};
        int target = 3;
        Assertions.assertEquals(majorityElement(nums), target);
    }

//    public int majorityElement(int[] nums) {
//        int result = 0;
//        int midLength = nums.length/2;
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int num : nums) {
//            map.put(num, map.getOrDefault(num, 0) + 1);
//        }
//        System.out.println(map);
//        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
//            if (entry.getValue() > midLength) {
//                result = entry.getKey();
//            }
//        }
//        return result;
//    }

    public int majorityElement(int[] nums) {
        int result = 0;
        int midLength = nums.length/2;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            int count = map.getOrDefault(num, 0) + 1;
            if (count > midLength) {
                result = num;
            }
            map.put(num, count);
        }
        System.out.println(map);
        return result;
    }
}
