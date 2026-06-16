package DSA_15_Days_Crash_Plan.Jun_16_2026;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;

public class Valid_Anagram_242 {

    @Test
    public void test01() {
        String s = "anagram";
        String t = "nagaram";
        boolean expected = true;
        Assert.assertEquals(expected,isAnagram(s,t));
    }

    //Using Hashing Technique
//    public boolean isAnagram(String actual, String target) {
//        HashMap<Character, Integer> mapActual = new HashMap<>();
//        HashMap<Character, Integer> mapTarget = new HashMap<>();
//        for (int i = 0; i < actual.length(); i++) {
//            mapActual.put(actual.charAt(i), mapActual.getOrDefault(actual.charAt(i), 0) + 1);
//        }
//        System.out.println(mapActual);
//        for (int i = 0; i < target.length(); i++) {
//            mapTarget.put(target.charAt(i), mapTarget.getOrDefault(target.charAt(i), 0) + 1);
//        }
//        System.out.println(mapTarget);
//        if(mapActual.equals(mapTarget)) {
//            System.out.println("Valid Anagram");
//        }
//        return mapActual.equals(mapTarget);
//    }

//    Using Ascii Technique
//    public boolean isAnagram(String actual, String target) {
//        int[] asciiA = new int[26];
//        for (int i = 0; i < actual.length(); i++) {
//            asciiA[actual.charAt(i) - 'a']++;
//        }
//        System.out.println(Arrays.toString(asciiA));
//        int[] asciiT = new int[26];
//        for (int i = 0; i < target.length(); i++) {
//            asciiT[target.charAt(i) - 'a']++;
//        }
//        System.out.println(Arrays.toString(asciiT));
//        return Arrays.toString(asciiA).equals(Arrays.toString(asciiT));
//    }

//    Using Ascii Technique
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] ascii = new int[26];
        for (int i = 0; i < s.length(); i++) {
            ascii[s.charAt(i) - 'a']++;
            ascii[t.charAt(i) - 'a']--;
        }
        System.out.println(Arrays.toString(ascii));
        for(int num : ascii){
            if(num != 0){
                return false;
            }
        }
        return true;
    }
}
