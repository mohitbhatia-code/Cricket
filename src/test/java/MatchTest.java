import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MatchTest {

    Batsman batsman = mock(Batsman.class);
    Baller baller = mock(Baller.class);

    @Test
    void shouldReturnTrueWhenTargetIsChased() {
        int scoreToBeChased = 12;
        int over = 2;

        Match cricketMatch = new Match(batsman, baller,scoreToBeChased, over);

        when(batsman.bat()).thenReturn(4);
        when(baller.ball()).thenReturn(1);
        cricketMatch.simulate();

        assertTrue(cricketMatch.wonMatch());
    }

    @Test
    void shouldReturnFalseWhenTargetIsNotChasedAndBatsmanIsNotOut() {
        int scoreToBeChased = 12;
        int over = 1;

        Match cricketMatch = new Match(batsman, baller, scoreToBeChased, over);

        when(batsman.bat()).thenReturn(1);
        when(baller.ball()).thenReturn(2);

        cricketMatch.simulate();

        assertFalse(cricketMatch.wonMatch());
    }

    @Test
    void shouldReturnFalseWhenBatsmanIsOutAndTargetNotAchieved() {
        int scoreToBeChased = 12;
        int over = 2;
        Match cricketMatch = new Match(batsman, baller, scoreToBeChased, over);

        when(batsman.bat()).thenReturn(1);
        when(baller.ball()).thenReturn(1);

        cricketMatch.simulate();

        assertFalse(cricketMatch.wonMatch());
    }
}
