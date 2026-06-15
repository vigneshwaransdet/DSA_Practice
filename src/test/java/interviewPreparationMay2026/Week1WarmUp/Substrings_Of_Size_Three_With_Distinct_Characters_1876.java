package interviewPreparationMay2026.Week1WarmUp;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class Substrings_Of_Size_Three_With_Distinct_Characters_1876 {

    @Test
    public void test01(){
        String s = "xyzzaz";
        int expected = 1;
        Assert.assertEquals(countGoodSubstrings(s), expected);
    }
    public int countGoodSubstrings(String s) {
        int count=0;
        for(int i=0;i+2<s.length();i++) {
            if(s.charAt(i) != s.charAt(i+1) &&
                    s.charAt(i+1) != s.charAt(i+2) &&
                    s.charAt(i) != s.charAt(i+2)) {
                count++;
            }
        }
        return count;
    }
}
