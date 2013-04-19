package thirdparty;

import java.util.Random;

public class ZenService {

    private static final Random zen = new Random();
    public int getUltimateAnswer() {
        switch(zen.nextInt() % 3) {
            case 0: return 42;
            case 1: return Integer.MAX_VALUE;
            default:
            throw new RuntimeException("ZenService is currently unavailable");
        }
    }
}
