import java.io.Writer;
import java.time.LocalDate;

public class Main {

    //Задание 1


    public static void main(String[] args) {
        // Задание 1
        int year = 2021;
        checkYear(year);

        //Задание 2
        int clientDeviceYear = 2022;
        int clientOS = 0;
        checkOS(clientOS,clientDeviceYear);

        //Задание 3
        int deliveryDistance = 10;
        calculateDays(deliveryDistance);

    }





    //Задание 1
    public static void checkYear(int yearnow) {
        int year2 = yearnow % 4;
        int year3 = yearnow % 100;
        int year400 = yearnow % 400;
        if (year2 == 0 && year3 != 0 || year400 == 0) {
            System.out.println(yearnow + " год является високсным");
        } else {
            System.out.println(yearnow + " год не является високосным");

        }
    }


    //Задание 2
    public static void checkOS(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        boolean year = clientDeviceYear < currentYear;
        if (clientOS == 0 && year == true) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        else if (clientOS == 1 && year == true) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        else if (clientOS == 0 && year == false) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if (clientOS == 1 && year == false) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }


    //Задание 3

    public static void calculateDays (int deliveryDistance) {

        int daysforDelivery = 1;
        int daysForDelivery2060 = daysforDelivery + 1;
        int daysForDelivery60 = daysForDelivery2060 + 1;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + daysforDelivery);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println(" Потребуется дней: " + daysForDelivery2060);
        } else {
            System.out.println("Потребуется дней: " + daysForDelivery60);
        }
    }


}


