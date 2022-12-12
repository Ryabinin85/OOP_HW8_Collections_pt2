package schoolTask;

import java.util.*;

public class MultiplicationTable {
    int number1;
    int number2;

    public MultiplicationTable(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MultiplicationTable that = (MultiplicationTable) o;
        return number1 == that.number1 && number2 == that.number2 || number1 == that.number2 && number2 == that.number1;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(number1) + Objects.hashCode(number2);
    }

    @Override
    public String toString() {
        return String.format("%-2d *  %-2d =  ?   :%d", number1, number2, hashCode());
    }

    public static void main(String[] args) {
        Random random = new Random();

        Set<MultiplicationTable> set = new HashSet<>();
        while (set.size() < 15) {
            MultiplicationTable multiplicationTable = new MultiplicationTable(random.nextInt(1, 10), random.nextInt(1, 10));
            set.add(multiplicationTable);
        }

        for (MultiplicationTable multiplicationTable : set) {
            System.out.println(multiplicationTable);
        }
    }
}
