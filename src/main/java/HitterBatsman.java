import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class HitterBatsman implements Batsman {

    public int bat() {
        Random random = new Random();
        List<Integer> list = Arrays.asList(0, 4, 6);
        return list.get(random.nextInt(list.size()));
    }
}
