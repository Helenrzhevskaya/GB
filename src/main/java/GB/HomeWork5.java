package GB;
/*
 *Java 1. Home work #5
 *
 * @author Elena Rzhevskaya
 * version 05.03.2022
 *
 */
class HomeWork5 {
    public static void main(String[] args) {

        Workman[] workArray = new Workman[5];

        workArray[0] = new Workman("Arkadiev Arkady Arkadevich", "locksmith", "icanfixanythingyouwant@yandex.ru", 222_22_22, 40_000, 34);
        workArray[1] = new Workman("Vasiliev Vasily Vasilievich", "guard", "guard.guard@mail.ru", 777-77-77, 85_000, 54);
        workArray[2] = new Workman("Grigoriev Grigory Grigorievich", "agronomist", "agro74@agro.ru", 656_77_90, 90_000, 27);
        workArray[3] = new Workman("Semyonov Semyon Semyonovich", "doctor", "yourhealthisinmyarms@mail.ru", 322_22_22, 230_000, 43);
        workArray[4] = new Workman("Kropachev Kropa Kropovich", "teacher", "teachyourchildren@mail.ru", 211_22_55, 100_000, 39);

        for (Workman workman : workArray) {
            if (workman.getAge() > 40) {
                System.out.println(workman);
            }
        }

    }
}
class Workman {
    private String fullName;
    private String position;
    private String email;
    private int phoneNumber;
    private int salary;
    private int age;

    Workman(String fullName, String position, String email, int phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return fullName + ", " + position + ", " + email + ", " + phoneNumber + ", " + salary + ", " + age;
    }
}