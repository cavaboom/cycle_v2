public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        int deposit = 15000;
        int total = 0;
        int month = 0    ;
        while (total < 2_459_000) {
            month++;
            total = total + deposit;
            System.out.println("Месяц " +month+ ", сумма накоплений равна " +total);
        }
        System.out.println("Месяц " +month+ ", сумма накоплений равна " +total+ " рублей");

    }
}