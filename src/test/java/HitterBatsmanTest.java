import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HitterBatsmanTest {

    HitterBatsman hitterBatsman = new HitterBatsman();


    @Test
    void hitterBatsmanShouldNotScoreLessThan0() {
        List<Integer> expectedScores = Arrays.asList(-1);
        int score = hitterBatsman.bat();

        assertFalse(expectedScores.contains(score));
    }

    @Test
    void hitterBatsmanShouldNotScoreGreaterThan6() {
        List<Integer> expectedScores = Arrays.asList(7,8);
        int score = hitterBatsman.bat();

        assertFalse(expectedScores.contains(score));
    }

    @Test
    void hitterBatsmanShouldScore0Or4Or6() {
        List<Integer> expectedScores = Arrays.asList(0,4,6);
        int score = hitterBatsman.bat();

        assertTrue(expectedScores.contains(score));
    }

    @Test
    void hitterBatsmanShouldNotScore1Or2Or3Or5() {
        List<Integer> expectedScores = Arrays.asList(1,2,3,5);
        int score = hitterBatsman.bat();

        assertFalse(expectedScores.contains(score));
    }

}
