
public class Main {
    public static void main(String[] args) {
        // Задача 1
        int clientOS = 0; // 0 — iOS, 1 — Android

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        // Задача 2
        int clientDeviceYear = 2015;

        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (clientOS == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }

        // Задача 3
        int year = 2021; // Можно изменить на любой интересующий год

        if (year <= 1584) {
            System.out.println("Год должен быть больше 1584.");
        } else if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        // Задача 4
        int deliveryDistance = 95;
        int days = 1; // Базовый срок — 1 день для расстояния до 20 км

        if (deliveryDistance <= 20) {
            days = 1;
        } else if (deliveryDistance <= 60) {
            days = 2;
        } else if (deliveryDistance <= 100) {
            days = 3;
        } else {
            System.out.println("Доставка невозможна: расстояние более 100 км.");
        }

        // Выводим срок доставки только если доставка возможна
        if (deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + days);
        }

        // Задача 5
        int monthNumber = 12; // Номер месяца

        if (monthNumber < 1 || monthNumber > 12) {
            System.out.println("Ошибка: номер месяца должен быть от 1 до 12.");
        } else {
            switch (monthNumber) {
                case 12:
                case 1:
                case 2:
                    System.out.println("Зима");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Весна");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Лето");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Осень");
                    break;
            }
        }
    }
}