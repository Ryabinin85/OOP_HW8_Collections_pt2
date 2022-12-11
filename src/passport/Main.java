package passport;


public class Main {

    public static void main(String[] args) {

        Passport passport1 = new Passport(123456, "Иванов", "Иван", "Иванович");
        Passport passport2 = new Passport(456123, "Петров", "Петр", "Петрович");
        Passport passport3 = new Passport(654123, "Сидоров", "Сидр", "Сидорович");
        Passport passport4 = new Passport(123456, "Васечкин", "Василий", "Васильевич");
        passport1.add(passport1);
        passport1.add(passport2);
        passport1.add(passport3);
        passport1.add(passport4);

        System.out.println(passport1.getPassportMap());
        System.out.println(passport1.getPassport(654123));
    }
}
