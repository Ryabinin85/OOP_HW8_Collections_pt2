package passport;

import java.time.LocalDate;
import java.util.Objects;

public class Passport {

    private final Integer number;
    private final String surname;
    private final String name;
    private final String patronymic;
    private final LocalDate birthDay;


    public Passport(Integer number, String surname, String name, String patronymic, LocalDate birthDay) {
        if (number != null && surname != null && name != null &&
                !surname.isBlank() && !surname.isEmpty() &&
                !name.isBlank() && !name.isEmpty() && birthDay != null) {
            this.number = number;
            this.surname = surname;
            this.name = name;
            this.birthDay = birthDay;
        } else
            throw new RuntimeException("Данные не заполнены");
        this.patronymic = patronymic;
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

    public LocalDate getBirthDay() {
        return birthDay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return Objects.equals(number, passport.number) && Objects.equals(surname, passport.surname) &&
                Objects.equals(name, passport.name) && Objects.equals(patronymic, passport.patronymic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, surname, name, patronymic);
    }

    @Override
    public String toString() {
        return "Паспорт №:" + number + "\n" + surname + " " + name + " " + patronymic + "\n" +
                "Дата рождения: " + birthDay;
    }
}