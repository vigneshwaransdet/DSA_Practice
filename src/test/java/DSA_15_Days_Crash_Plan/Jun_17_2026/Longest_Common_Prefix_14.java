package DSA_15_Days_Crash_Plan.Jun_17_2026;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/*
14. Longest Common Prefix

Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:
Input: strs = ["flower","flow","flight"]
Output: "fl"

Example 2:
Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.

Constraints:
1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters if it is non-empty.
*/
public class Longest_Common_Prefix_14 {
    @Test
    public void test01() {
        String[] str = {"flower","flow","flight"};
        String expected = "fl";
        Assertions.assertEquals(expected, longestCommonPrefix(str));

    }
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            String current = strs[i];
            prefix = comparePrefixAndCurrent(prefix, current);
        }
        return prefix;
    }

    public String comparePrefixAndCurrent(String prefix, String current) {
        int index = 0;
        StringBuilder res = new StringBuilder();
        int minLen = Math.min(prefix.length(), current.length());
        if (minLen == 0) {
            return res.toString();
        }
        while (index < minLen) {
            if (prefix.charAt(index) == current.charAt(index)) {
                res.append(prefix.charAt(index));
            } else {
                return res.toString();
            }
            index++;
        }
        return res.toString();
    }
}
