package passport;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<Integer, Passport> passportMap = new HashMap<>();

        Passport passport1 = new Passport(123456, "Иванов", "Иван", "Иванович", LocalDate.of(2002, 12, 12));
        Passport passport2 = new Passport(456123, "Петров", "Петр", "Петрович", LocalDate.of(1992, 12, 12));
        Passport passport3 = new Passport(654123, "Сидоров", "Сидр", "Сидорович", LocalDate.of(1982, 12, 12));
        Passport passport4 = new Passport(123456, "Васечкин", "Василий", "Васильевич", LocalDate.of(1972, 12, 12));

        passportMap.put(passport1.getNumber(), passport1);
        passportMap.put(passport2.getNumber(), passport2);
        passportMap.put(passport3.getNumber(), passport3);
        passportMap.put(passport4.getNumber(), passport4);

        System.out.println(passportMap);
        System.out.println(passportMap.containsKey(654123));
        System.out.println(passportMap.get(654123));
    }
}