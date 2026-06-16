package DSA_15_Days_Crash_Plan.Jun_16_2026;

/*
Contains_Duplicate_217

Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.



Example 1:

Input: nums = [1,2,3,1]

Output: true

Explanation:

The element 1 occurs at the indices 0 and 3.

Example 2:

Input: nums = [1,2,3,4]

Output: false

Explanation:

All elements are distinct.

Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]

Output: true

Constraints:

1 <= nums.length <= 105
-109 <= nums[i] <= 109
 */

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

public class Contains_Duplicate_217 {

    @Test
    public void test01() {
        int[] nums = {1,2,3,1};
        boolean expected = true;
        Assert.assertEquals(containsDuplicate(nums), expected);
    }

    //Brute Force Approach
//    public boolean containsDuplicate(int[] nums) {
//        for(int i = 0; i < nums.length; i++) {
//            for(int j = i + 1; j < nums.length; j++) {
//                if(nums[i] == nums[j]) {
//                    return true;
//                }
//            }
//        }
//        return false;
//    }

    //Two Pointers Approach - This will not work
    // for this test case -> [2,14,18,22,22]
//    public boolean containsDuplicate(int[] nums) {
//        int L=0, R=L+1;
//        while(R <  nums.length) {
//            if(nums[L] == nums[R]) {
//                return  true;
//            }
//            R++;
//        }
//        return false;
//    }

    //Optimized Approach using HashSet
    public boolean containsDuplicate(int[] nums) {
//        HashSet<Integer> set = new HashSet<>();
//        for(int i = 0; i < nums.length; i++){
//            if(!set.add(nums[i])) {
//                return true;
//            }
//        }

        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            if(!set.add(num)) {
                return true;
            }
        }
        return false;
    }
}
