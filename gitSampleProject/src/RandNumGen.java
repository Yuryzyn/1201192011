import java.util.Random;

public class RandNumGen {
    public int getRandNum(int limit){
        return new Random().nextInt(limit);
    }
}
