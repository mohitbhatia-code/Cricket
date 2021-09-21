public class Match {
    private final Batsman batsman;
    private final Baller baller;
    private final int target;
    private boolean isMatchWon;
    private final int over;


    public Match(Batsman batsman, Baller baller, int scoreToBeChased, int over) {
        this.batsman = batsman;
        this.target = scoreToBeChased;
        this.over = over;
        this.baller = baller;
    }

    public void simulate() {
        int currentScore = 0;
        for (int ball = 1; ball <= 6 * over; ball++) {
            int ballerScore = baller.ball();
            int batsmanScore = batsman.bat();
            if (batsmanScore == ballerScore) break;
            currentScore += batsmanScore;
            if (currentScore >= target) {
                isMatchWon = true;
                break;
            }
        }
    }

    public boolean wonMatch() {
        return isMatchWon;
    }


}
