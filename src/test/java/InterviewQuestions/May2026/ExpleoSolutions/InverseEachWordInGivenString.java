package InterviewQuestions.May2026.ExpleoSolutions;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class InverseEachWordInGivenString {

    @Test
    public void test() {
        String words = "Today is Saturday";
        String ExpectedResult = "yadoT si yadrutaS";
        Assert.assertEquals(ExpectedResult,inverseWords(words));
    }

    public String inverseWords(String words) {
        String[] splitWords = words.split(" ");

//        StringBuilder result = new StringBuilder();

//        for (String word : splitWords) {
//            result.append(new StringBuilder(word).reverse())
//                    .append(" ");
//        }
//
//        System.out.println(result.toString().trim());
//        return result.toString().trim();

        String res = "";
        StringBuilder sbWord;
        for (String word : splitWords) {
            sbWord = new StringBuilder();
            sbWord.append(word);
            StringBuilder reverseWord = sbWord.reverse();
            res += reverseWord.toString()+" ";
        }
        System.out.println(res.trim());
        return res.trim();
    }
}
