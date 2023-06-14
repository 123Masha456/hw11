import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 2");
        int year = 0;
        checkYear(year);
        year = 567;
    }

    public static void checkYear(int year) {
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високосный");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientOs = 0;
        int deviceYear = 2015;
        printVersionType(clientOs, deviceYear);
    }

    public static void printVersionType(int clientOs, int clientDeviceYear) {
        int iOs = 0;
        int android = 1;
        int currentYear = LocalDate.now().getYear();
        if (clientOs == iOs) {
            System.out.println("Клиент пользуется iOs");
            if (clientDeviceYear < currentYear) {
                System.out.println("Установите облегченную версию для iOs по ссылке");
            } else {
                System.out.println("Установите обычную версию для iOs");
            }
        } else if (clientOs == android) {
            System.out.println("Клиент пользуется Android");
            if (clientDeviceYear < currentYear) {
                System.out.println("Установите облегченную версию для Android по ссылке");
            } else {
                System.out.println("Установите обычную версию для Android");
            }
        } else {
            System.out.println("Данная ОС не поддерживается");
        }
    }


    public static void task3() {
        System.out.println("Задача 3");
        int days = calculateDeliveryDays(30);
        if (days > 0) {
            System.out.println("Доставка есть");
        } else {
            System.out.println("Доставки нет");
        }
        System.out.println("Потребуется дней " + days);
    }

    public static int calculateDeliveryDays(int distance) {
        int deliveryDays = 0;
        if (distance < 20) {
            deliveryDays = 1;
        } else if (distance < 60) {
            deliveryDays = 2;
        } else if (distance < 100) {
            deliveryDays = 3;
        } else {
            deliveryDays = -1;
        }
        return deliveryDays;
    }
}