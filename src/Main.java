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
        // Задание 2.2
        System.out.println("Задание 2.2");
        double deposite_v2 = 15000;
        for (int a = 1; deposite_v2 <= 12_000_000; a++) {
            deposite_v2 = deposite_v2 + deposite_v2 * 0.07;
            if (a % 6 == 0) {
                System.out.println("Месяц " + a + " сумма накоплений " + deposite_v2);
            }
        }
        System.out.println("Сумма накоплений равна " +deposite_v2);
        // Задание 2.3
        System.out.println("Задание 2.3");
        double deposite_v3 = 15000;
        int month_v2 = 1;
        while (month_v2 <= 108) {
            deposite_v3 = deposite_v3 + deposite_v3 * 0.07;
            if (month_v2 % 6 == 0) {
                System.out.println("Месяц " + month_v2 + " сумма накоплений " + deposite_v3);
            }
            month_v2++;
        }
        // Задание 2.4
        System.out.println("Задание 2.4");
        int friday = 4;
        for (; friday < 31; friday = friday + 7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо поготовить отчёт.");
        }
        //Задание 3.1
        System.out.println("Задание 3.1");
        int cometYear = 0;
        int cometPeriod = 79;
        int ourYear = 2022;
        int startPeriod = ourYear - 200;
        int endPeriod = ourYear + 100;
        for (; cometYear <= endPeriod; cometYear = cometYear + cometPeriod) {
            if (cometYear >= startPeriod && cometYear <= ourYear) {
                System.out.println(cometYear);
            }
            if (cometYear <= endPeriod && cometYear >= ourYear) {
                System.out.println(cometYear);
            }
        }
    }
}