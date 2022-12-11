package random20;

import java.util.*;

public class Random20 {
    private final Set<Integer> random20 = new HashSet<>();

    Random random = new Random();

    public void add() {
        while (random20.size() < 20) {
            random20.add(random.nextInt(1000));
        }
    }

    public void remove() {
        random20.removeIf(integer -> integer % 2 == 1);
    }

    public Set<Integer> getRandom20() {
        return random20;
    }

    public static void main(String[] args) {
        Random20 random20 = new Random20();
        random20.add();

        for (Integer integer : random20.getRandom20())
            System.out.println(integer);

        System.out.println();

        random20.remove();

        for (Integer integer : random20.getRandom20())
            System.out.println(integer);
    }
}