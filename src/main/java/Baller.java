import java.util.Random;

public class Baller {
    public int ball() {
        Random random = new Random();
        int max = 6;
        return random.nextInt((max) + 1);
    }
}
