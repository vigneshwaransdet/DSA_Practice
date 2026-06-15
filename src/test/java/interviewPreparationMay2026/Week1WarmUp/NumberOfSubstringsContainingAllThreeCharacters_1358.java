package interviewPreparationMay2026.Week1WarmUp;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class NumberOfSubstringsContainingAllThreeCharacters_1358 {
    @Test
    public void test01() {
        String s = "abcabc";
        int expected = 10;
        Assert.assertEquals(numberOfSubstringsContainingAllThreeCharacters(s), expected);
    }

    @Test
    public void test02() {
        String s = "aaacb";
        int expected = 3;
        Assert.assertEquals(numberOfSubstringsContainingAllThreeCharacters(s), expected);
    }

    @Test
    public void test03() {
        String s = "abc";
        int expected = 1;
        Assert.assertEquals(numberOfSubstringsContainingAllThreeCharacters(s), expected);
    }

    public int numberOfSubstringsContainingAllThreeCharacters(String s) {
        int L = 0, R = 0, count = 0;
        int[] freq = new int[3];
        while (R < s.length()) {
            freq[s.charAt(R)-'a']++;
            while(freq[0] > 0 && freq[1] > 0 && freq[2] > 0) {
                count += s.length() - R;
                freq[s.charAt(L)-'a']--;
                L++;
            }
            R++;
        }
        return count;
    }
}
