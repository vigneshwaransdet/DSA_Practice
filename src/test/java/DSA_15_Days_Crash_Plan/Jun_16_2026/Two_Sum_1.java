package DSA_15_Days_Crash_Plan.Jun_16_2026;

/*

Two_Sum_1

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]

Example 3:
Input: nums = [3,3], target = 6
Output: [0,1]

Constraints:
2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.

 */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class Two_Sum_1 {

//  Example 1:
    @Test
    public void test01() {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] expect = {0,1};
        Assertions.assertArrayEquals(expect, twoSum(nums, target));
    }

//  Example 2:
    @Test
    public void test02() {
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] expect = {1, 2};
        Assertions.assertArrayEquals(expect, twoSum(nums, target));
    }

//  Example 3:
    @Test
    public void test03() {
        int[] nums = {3, 3};
        int target = 6;
        int[] expect = {0,1};
        Assertions.assertArrayEquals(expect, twoSum(nums, target));
    }

    //Brute Force Approach
//    public int[] twoSum(int[] nums, int target) {
//        boolean flag = false;
//        int[] res = new int[2];
//        for(int i = 0; i < nums.length; i++) {
//            for(int j = i + 1; j < nums.length; j++) {
//                if(nums[i] + nums[j] == target){
//                    res[0] = i;
//                    res[1] = j;
//                    flag = true;
//                    break;
//                }
//            }
//            if(flag){
//                break;
//            }
//        }
//        return  res;
//    }

    //Brute Force Approach with 2 pointers
//    public int[] twoSum(int[] nums, int target) {
//        int L=0,R=1;
//        int[] res =new int[2];
//        while(L < nums.length) {
//            if(nums[L] + nums[R] == target) {
////                res[0] = L;
////                res[1] = R;
////                break;
//                //OR
//                return new int[]{L,R};
//            }
//            R++;
//            if(R == nums.length) {
//                L++;
//                R=L+1;
//            }
//        }
//        return res;
//    }

    //Optimized Approach using HashMap
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }

}
