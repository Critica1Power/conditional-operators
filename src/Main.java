public class Main {
    public static void main(String[] args) {task1(); task2(); task3();}

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

    }
}