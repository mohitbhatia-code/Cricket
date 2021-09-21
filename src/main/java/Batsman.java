import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Batsman {

    private final BatsmanType batsmanType;

    public Batsman(BatsmanType batsmanType) {
        this.batsmanType = batsmanType;
    }

    public int bat() {
        Random random = new Random();
        if (batsmanType.equals(BatsmanType.HITMAN)) {
            List<Integer> list = Arrays.asList(0, 4, 6);
            return list.get(random.nextInt(list.size()));
        } else {

            int max = 6;
            return random.nextInt((max) + 1);
        }
    }
}
