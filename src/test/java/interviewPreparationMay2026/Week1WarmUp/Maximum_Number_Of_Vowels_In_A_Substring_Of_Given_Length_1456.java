package interviewPreparationMay2026.Week1WarmUp;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

/*
1456. Maximum Number of Vowels in a Substring of Given Length
Medium
Topics
premium lock icon
Companies
Hint
Given a string s and an integer k, return the maximum number of vowel letters in any substring of s with length k.

Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.



Example 1:

Input: s = "abciiidef", k = 3
Output: 3
Explanation: The substring "iii" contains 3 vowel letters.
Example 2:

Input: s = "aeiou", k = 2
Output: 2
Explanation: Any substring of length 2 contains 2 vowels.
Example 3:

Input: s = "leetcode", k = 3
Output: 2
Explanation: "lee", "eet" and "ode" contain 2 vowels.


Constraints:

1 <= s.length <= 105
s consists of lowercase English letters.
1 <= k <= s.length

 */

public class Maximum_Number_Of_Vowels_In_A_Substring_Of_Given_Length_1456 {

    @Test
    public void test() {
        String s = "abciiidef";
        int k = 3;
        int expected = 3;
        Assert.assertEquals(maxVowels(s, k), expected);
    }

    public int maxVowels(String s, int k) {
        int L = 0, R = 0, count = 0, maxCount = Integer.MIN_VALUE;
        while (R < s.length()) {
            if (s.charAt(R) == 'a' || s.charAt(R) == 'e' || s.charAt(R) == 'i' || s.charAt(R) == 'o' || s.charAt(R) == 'u') {
                count++;
            }
            if (R - L + 1 > k) {
                if (s.charAt(L) == 'a' || s.charAt(L) == 'e' || s.charAt(L) == 'i' || s.charAt(L) == 'o' || s.charAt(L) == 'u') {
                    count--;
                }
                L++;
            }
            if ((R - L + 1) == k) {
                maxCount = Math.max(maxCount, count);
            }
            R++;
        }
        return maxCount;
    }
}