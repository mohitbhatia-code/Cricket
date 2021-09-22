import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NormalBatsmanTest {
    NormalBatsman normalBatsman = new NormalBatsman();


    @Test
    void normalBatsmanShouldNotScoreLessThan0() {
        List<Integer> expectedScores = Arrays.asList(-1);
        int score = normalBatsman.bat();

        assertFalse(expectedScores.contains(score));
    }

    @Test
    void normalBatsmanShouldNotScoreGreaterThan6() {
        List<Integer> expectedScores = Arrays.asList(7,8);
        int score = normalBatsman.bat();

        assertFalse(expectedScores.contains(score));
    }

    @Test
    void normalBatsmanShouldScoreBetween0And6() {
        List<Integer> expectedScores = Arrays.asList(0,1,2,3,4,5,6);
        int score = normalBatsman.bat();

        assertTrue(expectedScores.contains(score));
    }
}
