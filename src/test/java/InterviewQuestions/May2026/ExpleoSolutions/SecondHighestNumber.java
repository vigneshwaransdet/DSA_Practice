package InterviewQuestions.May2026.ExpleoSolutions;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SecondHighestNumber {

    @Test
    public void test(){
        int[] arr = new int[] {1,3,2,5};
        int expected = 3;
        SecondHighestNumber(arr);
    }
    //Brute Force Approach
//    public void SecondHighestNumber(int[] arr) {
//        Set<Integer> set = new HashSet<>();
//        for (int i = 0; i < arr.length; i++) {
//            set.add(arr[i]);
//        }
//        System.out.println(set);
//        System.out.println(set.size()-1);
//    }

    //Using bubble sort array
//    public void SecondHighestNumber(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if(arr[i] > arr[j]){
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//        int res = arr[arr.length - 2];
//        System.out.println(res);
//    }

//    Note:
//    TC - O(n)^2
//    SC - O(1)

    //TODO - Using bubble sort array by optimized way
    public void SecondHighestNumber(int[] arr) {

    }
}

