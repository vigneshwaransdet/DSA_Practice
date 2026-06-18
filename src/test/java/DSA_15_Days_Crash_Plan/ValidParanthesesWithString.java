package DSA_15_Days_Crash_Plan;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Stack;

public class ValidParanthesesWithString {
    @Test
    public  void test01() {
        String s = "(a)";
        boolean expected = true;
        Assert.assertEquals(isValid(s),expected);
    }
    /*
    String s="{[[[[}]]]()"  output invalid
String k="{}[]()"   output valid
     */
    @Test
    public  void test02() {
        String s = "{[[[[}]]]()";
        boolean expected = false;
        Assert.assertEquals(isValid(s),expected);
    }

    @Test
    public  void test03() {
        String s = "{}[]()";
        boolean expected = true;
        Assert.assertEquals(isValid(s),expected);
    }
    @Test
    public  void test04() {
        String s = "((dlksd){sa[acas]sac}sacsa)";
        boolean expected = true;
        Assert.assertEquals(isValid(s),expected);
    }

    @Test
    public  void test05() {
        String s = "(scekj21e+_3)";
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
            if (s.charAt(i) == '(' || s.charAt(i) == ')' ||
                    s.charAt(i) == '[' || s.charAt(i) == ']' ||
                    s.charAt(i) == '{' || s.charAt(i) == '}') {
                if (!stack.isEmpty() && stack.peek() == map.get(s.charAt(i))) {
//                    System.out.println(map.get(s.charAt(i)));
                    stack.pop();
                } else {
                    stack.push(s.charAt(i));
                }
            }
        }
        if(stack.isEmpty()) {
//            System.out.println("Valid Parantheses");
            return true;
        } else{
//            System.out.println("Invalid Parantheses");
        }
        return false;
    }
}
