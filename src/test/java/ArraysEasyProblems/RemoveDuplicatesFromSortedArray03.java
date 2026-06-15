package ArraysEasyProblems;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatesFromSortedArray03 {
    @Test
    public void test1() {
        int[] nums = {1, 1, 2};
        int k = 2;
        removeDuplicates(nums);
    }

    @Test
    public void test2() {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k = 2;
        removeDuplicates(nums);
    }

    @Test
    public void test3() {
        int[] nums = {98,99,99,100};
        int k = 2;
        removeDuplicates(nums);
    }

    public int removeDuplicates(int[] nums) {
//        int[] temp = new int[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            temp[i] = nums[i];
//        }


//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < temp.length; j++) {
//                if (temp[i] == temp[j]) {
//                    nums[j] = '_';
//                }
//            }
//        }
//        Arrays.sort(nums);
//        System.out.println(Arrays.toString(nums));
//        int count = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] != '_') {
//                count++;
//            }
//        }
//        System.out.println(count);

//        List<Integer> list = new ArrayList<>();
//        for(int j = 0; j < nums.length; j++) {
//            if(nums[j] != '_') {
//                list.add(nums[j]);
//            }
//        }
//        System.out.println(list);
//        for(int j = 0; j < list.size(); j++) {
//            nums[j] = list.get(j);
//        }
//        System.out.println(Arrays.toString(nums));

//        List<Integer> list = Arrays.stream(nums)
//                .boxed()
//                .toList();
//
//        System.out.println(list);


//        return count;

        //Two pointers Approach
        int rd = 0;
        int[] temp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            temp[i] = nums[i];
        }
        for (int i = 1; i < nums.length; i++) {
            if(temp[i-1]!=temp[i]) {
                nums[i] = temp[i-1];
            }
        }

//        TODO
        return ++rd;
    }

    //    public void removeDuplicates(int[] nums) {
//        int[] temp = new int[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            temp[i] = nums[i];
//        }
//        System.out.println(Arrays.toString(temp));
//        for(int i=0; i<nums.length; i++) {
//            for(int j=i+1; j<nums.length; j++) {
//                if(nums[i]==nums[j]) {
//                    temp[j] = '_';
//                    }
//                }
//            }
//            Arrays.sort(temp);
//            System.out.println(Arrays.toString(temp));

//            char[] temp1 = new char[temp.length];
//            for(int i=0; i<temp.length; i++) {
//                temp1[i] = (char) temp[i];
//            }
//            System.out.println(Arrays.toString(temp1));
//            for(int i=0; i<temp1.length; i++) {
//                if(temp1[i]=='_') {
//
//                }
//            }

//    }
}