package DSA_15_Days_Crash_Plan;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Stack;

/*
20. Valid Parentheses

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
An input string is valid if:
Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.

Example 1:
Input: s = "()"
Output: true

Example 2:
Input: s = "()[]{}"
Output: true

Example 3:
Input: s = "(]"
Output: false

Example 4:
Input: s = "([])"
Output: true

Example 5:
Input: s = "([)]"
Output: false

Constraints:
1 <= s.length <= 104
s consists of parentheses only '()[]{}'.

 */

public class ValidParantheses {

    @Test
    public  void test01() {
        String s = "()";
        boolean expected = true;
        Assert.assertEquals(isValid(s),expected);
    }

    @Test
    public  void test02() {
        String s = "()[]{}";
        boolean expected = true;
        Assert.assertEquals(isValid(s),expected);
    }

    @Test
    public  void test03() {
        String s = "(]";
        boolean expected = false;
        Assert.assertEquals(isValid(s),expected);
    }

    @Test
    public  void test04() {
        String s = "([)]";
        boolean expected = false;
        Assert.assertEquals(isValid(s),expected);
    }

    @Test
    public  void test05() {
        String s = "{([])}";
        boolean expected = true;
        Assert.assertEquals(isValid(s),expected);
    }

    public boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(!stack.isEmpty() && stack.peek() == map.get(s.charAt(i))) {
                System.out.println(map.get(s.charAt(i)));
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }
        if(stack.isEmpty()) {
            System.out.println("Valid Parantheses");
            return true;
        } else{
            System.out.println("Invalid Parantheses");
        }
        return false;
    }
}
