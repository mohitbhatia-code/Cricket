import java.util.Arrays;
import java.util.List;
import java.util.Random;

public enum BatsmanType {
    NORMAL{
        @Override
        int bat() {
            Random random = new Random();
            return random.nextInt(7);
        }
    },
    HITTER{
        @Override
        int bat() {
            Random random = new Random();
            List<Integer> list = Arrays.asList(0, 4, 6);
            return list.get(random.nextInt(list.size()));
        }
    };
    abstract int bat();


}
