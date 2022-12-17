public class Main {
    public static void main(String[] args) {
        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1. Напишите программу для вывода ФИО сотрудника");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("ФИО сотрудника - " + fullName);
    }
    public static void task2() {
        System.out.println("Задача 2. Напишите программу изменяющую написание Ф. И. О. сотрудника с Ivanov Ivan Ivanovich на полностью заглавные буквы");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullName.toUpperCase());
    }
    public static void task3() {
        System.out.println("Задача 3. Напишите программу для вывода ФИО сотрудника без символа ё");
        String firstName = "Семён";
        String middleName = "Семёнович";
        String lastName = "Иванов";
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("ФИО сотрудника - " + fullName.replace('ё', 'е'));
    }
}
