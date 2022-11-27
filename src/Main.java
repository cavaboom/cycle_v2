public class Main {
    public static void main(String[] args) {
        // Задание 1.1
        System.out.println("Задание 1.1");
        int deposit = 15000;
        int total = 0;
        int month = 0;
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
        System.out.println();
        // Задание 1.3
        System.out.println("Задание 1.3");
        int population = 12_000_000;
        int born = 17;
        int death = 8;
        for (int year = 1; year <= 10; year++) {
            population = population + population * (born - death) / 1000;
            System.out.println("Год " +year+ " численность населения составляет " +population);
        }
        System.out.println("Численность населения через 10 лет " +population);
        // Задание 2.1
        System.out.println("Задание 2.1");
        double deposite = 15000;
        for (int a = 1; deposite <= 12_000_000; a++) {
            deposite = deposite + deposite * 0.07;
            System.out.println("Месяц " +a+ " сумма накоплений " +deposite);
        }
        System.out.println("Сумма накоплений равна " +deposite);

    }
}