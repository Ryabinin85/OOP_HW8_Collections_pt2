package passport;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Passport {

    private final Integer number;
    private final String surname;
    private final String name;
    private final String patronymic;
    private final Map<Integer, Passport> passportMap = new HashMap<>();

    public Passport(Integer number, String surname, String name, String patronymic) {
        if (number != null && surname != null && name != null &&
                !surname.isBlank() && !surname.isEmpty() &&
                !name.isBlank() && !name.isEmpty()) {
            this.number = number;
            this.surname = surname;
            this.name = name;
        } else
            throw new RuntimeException("Данные не заполнены");
        this.patronymic = patronymic;
    }

    public void add(Passport passport) {
        passportMap.put(passport.getNumber(), new Passport(passport.getNumber(), passport.getSurname(), passport.getName(), passport.getPatronymic()));
    }

    public Passport getPassport(Integer number) {
        return passportMap.get(number);
    }

    public Map<Integer, Passport> getPassportMap() {
        return passportMap;
    }

    public Integer getNumber() {
        return number;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return Objects.equals(number, passport.number) && Objects.equals(surname, passport.surname) &&
                Objects.equals(name, passport.name) && Objects.equals(patronymic, passport.patronymic) &&
                Objects.equals(passportMap, passport.passportMap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, surname, name, patronymic, passportMap);
    }

    @Override
    public String toString() {
        return "Passport{" +
                "number=" + number +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", passportMap=" + passportMap +
                '}';
    }
}
