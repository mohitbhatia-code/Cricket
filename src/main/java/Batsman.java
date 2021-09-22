

public class Batsman {

    private final BatsmanType batsmanType;

    public Batsman(BatsmanType batsmanType) {
        this.batsmanType = batsmanType;
    }

    public int bat() {
        return batsmanType.bat();
    }
}
