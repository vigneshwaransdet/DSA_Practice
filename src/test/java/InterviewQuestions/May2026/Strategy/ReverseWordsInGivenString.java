package InterviewQuestions.May2026.Strategy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Interview Question:
 * Company Name: Strategy / MicroStrategy
 * Interview Date: 17-May-2025
 * Java Program:
 * Input:
 * String words = "Vigneshwaran Test Automation Engineer";
 *
 * Output:
 * String expectedResult = "Engineer Automation Test Vigneshwaran";
 *
 * Constraints:
 * No Constraints
 *
 * Note:
 * I said to interviewer for the multiple ways
 * 1st Way:
 * We can solve it via inbuilt methods such as StringBuffer, StringBuilder
 *
 * 2nd way:
 * brute force
 *
 * She said okay, then she asked me to solve in both inbuilt method and other way
 *
 * Note:
 * I failed to solve this question at the time of interview due to not practicing consitently DSA due to office work.
 *
 */
public class ReverseWordsInGivenString {
    @Test
    public void testPositive() {
        String words = "Vigneshwaran Test Automation Engineer";
        String expectedResult = "Engineer Automation Test Vigneshwaran";
        Assertions.assertTrue(reverseGivenString(words).equals(expectedResult));
    }

    @Test
    public void testNegative() {
        String words = "";
        String expectedResult = "";
        Assertions.assertTrue(reverseGivenString(words).equals(expectedResult));
    }

    @Test
    public void testEdge() {
        String words = "V";
        String expectedResult = "V";
        Assertions.assertTrue(reverseGivenString(words).equals(expectedResult));
    }

    @Test
    public void testPositiveOpt() {
        String words = "Vigneshwaran Test Automation Engineer";
        String expectedResult = "Engineer Automation Test Vigneshwaran";
        Assertions.assertTrue(reverseGivenStringOptimized(words).equals(expectedResult));
    }

    @Test
    public void testPositiveOpt01() {
        String words = "Vigneshwaran is Test Automation Engineer";
        String expectedResult = "Engineer Automation Test is Vigneshwaran";
        Assertions.assertTrue(reverseGivenStringOptimized(words).equals(expectedResult));
    }



    @Test
    public void testNegativeOpt() {
        String words = "";
        String expectedResult = "";
        Assertions.assertTrue(reverseGivenStringOptimized(words).equals(expectedResult));
    }

    @Test
    public void testEdgeOpt() {
        String words = "V";
        String expectedResult = "V";
        Assertions.assertTrue(reverseGivenStringOptimized(words).equals(expectedResult));
    }



    // Brute Force Approach
    public String reverseGivenString(String words) {
        if(words == null || words.length() == 0) {
            return words;
        }
        String[] splitWords = words.split(" ");
        int size = splitWords.length;
        System.out.println(size);
        String[] resultArray = new String[size];
        int j = 0;
        for (int i = size - 1; i >= 0; i--) {
            for (; j < size; ) {
                resultArray[j] = splitWords[i];
                j++;
                break;
            }
        }
        String resTemp = "";
        for (String word : resultArray) {
            resTemp = resTemp+word + " ";
        }
        String res = resTemp.trim();
        System.out.println("res :" + res);
        return res;
    }

    //Optimized Approach
    public String reverseGivenStringOptimized(String words) {
        if (words == null || words.length() == 0) {
            return words;
        }
        String[] splitWords = words.split(" ");
        int size = splitWords.length;
        System.out.println(size);
        int L=0, R = size-1;
        while(L < R) {
            String temp = splitWords[L];
            splitWords[L] = splitWords[R];
            splitWords[R] = temp;
            L++;
            R--;
        }
        String resTemp = "";
        for (String word : splitWords) {
            resTemp = resTemp+word + " ";
        }
        String res = resTemp.trim();
        System.out.println("res :" + res);
        return res;
    }
}
