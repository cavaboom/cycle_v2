public class Main {
    public static void main(String[] args) {
        // Задание 1.1
        System.out.println("Задание 1.1");
        int deposit = 15000;
        int total = 0;
        int month = 0    ;
        while (total < 2_459_000) {
            month++;
            total = total + deposit;
            System.out.println("Месяц " +month+ ", сумма накоплений равна " +total);
        }
        System.out.println("Месяц " +month+ ", сумма накоплений равна " +total+ " рублей");
        // Задание 1.2
        System.out.println("Задание 1.2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i++);
        }
        System.out.println();
        for (i = 10; i >= 1; i--) {
            System.out.print(i);
        }
    }
}