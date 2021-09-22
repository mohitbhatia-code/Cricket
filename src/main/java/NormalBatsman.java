import java.util.Random;

public class NormalBatsman implements Batsman {
    public int bat() {
        Random random = new Random();
        return random.nextInt(7);
    }

}
