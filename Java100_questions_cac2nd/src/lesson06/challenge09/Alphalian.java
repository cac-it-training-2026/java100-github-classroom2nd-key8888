package lesson06.challenge09;

import java.util.concurrent.ThreadLocalRandom;

public class Alphalian {
    private String name;

    public Alphalian() {
        String[] names = {"A", "B", "C", "D", "E"};
        int index = ThreadLocalRandom.current().nextInt(names.length);
        this.name = names[index];
    }

    public String getName() {
        return name;
    }
}
