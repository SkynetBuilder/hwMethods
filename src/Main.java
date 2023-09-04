import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void isYearLeap(int year) {
        if ((year % 4 == 0 && year % 100 > 0) || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void suggestApp(int OS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientDeviceYear < currentYear) {
            System.out.print("Установите облегченную версию приложения для ");
            if (OS == 0) {
                System.out.println("iOS по ссылке");
            } else if (OS == 1) {
                System.out.println("Android по ссылке");
            }
        } else {
            System.out.print("Установите версию приложения для ");
            if (OS == 0) {
                System.out.println("iOS по ссылке");
            } else if (OS == 1) {
                System.out.println("Android по ссылке");
            }
        }
    }

    public static String deliveryTimeForDistance(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            return "Потребуется дней: 1";
        } else if (deliveryDistance <= 60) {
            return "Потребуется дней: 2";
        } else if (deliveryDistance <= 100) {
            return "Потребуется дней: 3";
        } else {
            return "Доставки нет";
        }
    }

    public static void task1() {
        System.out.println("Задача 1");
        isYearLeap(2021);
    }

    public static void task2() {
        System.out.println("Задача 2");
        suggestApp(0, 2015);
    }

    public static void task3() {
        System.out.println("Задача 3");
        System.out.println(deliveryTimeForDistance(95));
    }
}