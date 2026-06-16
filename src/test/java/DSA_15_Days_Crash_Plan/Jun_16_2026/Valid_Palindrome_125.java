package DSA_15_Days_Crash_Plan.Jun_16_2026;

/*
Valid_Palindrome_125

A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.



Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.


Constraints:

1 <= s.length <= 2 * 105
s consists only of printable ASCII characters.
 */

import org.junit.Assert;
import org.junit.Test;

public class Valid_Palindrome_125 {

    @Test
    public void test01(){
        String s = "A man, a plan, a canal: Panama";
        boolean expected = true;
        Assert.assertEquals(expected,isPalindrome(s));

    }

    @Test
    public void test02(){
        String s = "madam";
        boolean expected = true;
        Assert.assertEquals(expected,isPalindrome(s));

    }
    @Test
    public void test03(){
        String s = "0P";
        boolean expected = false;
        Assert.assertEquals(expected,isPalindrome(s));

    }
    //Brute Force Approach due to used String
//    public boolean isPalindrome(String s) {
//        String temp = "";
//        for(int i = 0; i < s.length(); i++) {
//            if(Character.isLetterOrDigit(s.charAt(i))) {
//                temp += s.charAt(i);
//            }
//        }
//        //TC - O(n)
//        //SC - O(n)
//        temp = temp.toLowerCase();
//        int start = 0, end = temp.length() - 1;
//        while(start < end){
//            if(temp.charAt(start) != temp.charAt(end)) {
//                return false;
//            }
//            start++;
//            end--;
//        }
//        //TC - O(n)
//        return true;
//    }
    //Note:
    //TC - O(n) * O(n) -> O(n)^2
    //SC - O(n)

    //Optimized Approach using String Builder
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            if(Character.isLetterOrDigit(s.charAt(i))) {
                sb.append(s.charAt(i));
            }
        }
        //TC - O(n)
        //SC - O(n)
        String temp = sb.toString().toLowerCase();
        int start = 0, end = temp.length() - 1;
        while(start < end){
            if(temp.charAt(start) != temp.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        //TC - O(n)
        return true;
    }
}
