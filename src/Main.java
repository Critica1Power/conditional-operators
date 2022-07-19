public class Main {
    public static void main(String[] args) {task1(); task2(); task3(); task4();}

    public static void task1() {

        // Задание 1

        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task2() {

        // Задание 2

        int ClientOS = 0;
        int clientDeviceYear = 2016;

        if (ClientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }
          else {
              if (clientDeviceYear < 2015) {
                  System.out.println("Установите облегченную версию приложения для Android по ссылке");
              }
              else {
                  System.out.println("Установите версию приложения для Android по ссылке");

            }
        }


    }

    public static void task3() {

        // Задание 3

        int year = 2024;

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year +" год является високосным");
        } else {
            System.out.println(year +" год не является високосным");
        }


    }

    public static void task4() {

        // Задание 4

        int deliveryDistance = 95;

        int deliveryDays = 1;

        if (deliveryDistance > 20) {
            deliveryDays++;
        }
        if (deliveryDistance > 60) {
            deliveryDays++;
        }

        System.out.println("Потребуется дней: " + deliveryDays);

    }
}