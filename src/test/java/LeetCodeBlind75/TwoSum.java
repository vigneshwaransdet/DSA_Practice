package LeetCodeBlind75;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

/**
 * Brute Force Approach
 */

public class TwoSum {
    @Test
    public void twoSum(){
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        Assert.assertArrayEquals(new int[]{0,1}, twoSum(nums, target));
    }

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        boolean flag = false;
        for(int i = 0; i< nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i]+nums[j]==target){
                    result[0] = i;
                    result[1] = j;
                    flag = true;
                    break;
                }
            }
            if(flag==true){
                break;
            }
        }
        System.out.println(Arrays.toString(result));
        return result;
    }
}
