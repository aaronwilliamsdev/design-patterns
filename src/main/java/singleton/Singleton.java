package singleton;

import java.util.Date;

public final class Singleton {

    private static Singleton INSTANCE;

    private static String epoch;

    public String getEpoch() {
        return epoch;
    }

    private Singleton() {
    }

    public static Singleton getInstance() {
        if(INSTANCE == null) {
            epoch = new Date().toString();
            INSTANCE = new Singleton();
        }

        return INSTANCE;
    }

}