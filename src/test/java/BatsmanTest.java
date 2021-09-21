import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BatsmanTest {

    @Test
    void scoreShouldBeBetween0And6ForANormalBatsman() {
        Batsman batsman = new Batsman(BatsmanType.NORMAL);
        int score = batsman.bat();
        List<Integer> expectedScores = Arrays.asList(0,1,2,3,4,5,6);
        assertTrue(expectedScores.contains(score));
    }

    @Test
    void scoreShouldBe0Or4Or6ForAHitman() {
        Batsman batsman = new Batsman(BatsmanType.HITMAN);
        int score = batsman.bat();
        List<Integer> expectedScores = Arrays.asList(0,4,6);
        assertTrue(expectedScores.contains(score));
    }
}
