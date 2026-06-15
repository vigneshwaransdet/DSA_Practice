package InterviewQuestions.May2026.Strategy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Interview Question:
 * Company Name: Strategy / MicroStrategy
 * Interview Date: 17-May-2025
 * Java Program:
 * Input:
 * int[] arr = {0,1,0,0,2,5,3,3,4,5,2,2,1};
 *
 * Output:
 * arr = {0,1,2,3,4,5};
 *
 * Constraints:
 * No Constraints
 *
 * Note:
 * I tried to do pseudocode, but interviewer asked to solve with program.
 *
 * Note:
 * I failed to solve this question at the time of interview due to not practicing consistently DSA due to office work.
 *
 */

public class RemoveDuplicatesAndSortInAscendingOrder {
    @Test
    public void test() {
        int[] arr = {0,1,0,0,2,5,3,3,4,5,2,2,1};
        Assertions.assertArrayEquals(new int[]{0, 1, 2, 3, 4, 5}, toRemoveDuplicatesAndSortInAscendingOrder(arr));
    }

    public int[] toRemoveDuplicatesAndSortInAscendingOrder(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i : arr) {
            set.add(i);
        }
        int[] result = new int[set.size()];
        int index = 0;
        for (int i : set) {
            result[index++] = i;
        }
        return result;
    }
}
