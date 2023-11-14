public class Main {

    public static void main(String [] args){
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1 (){
        System.out.println("Задача 1");
        int clientOS = 1;
        if (clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1){
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Для вашей операционной системы еще нет приложения.");
        }
    }

    public static void task2 (){
        System.out.println("Задача 2");
        int clientOS = 1;
        int clientDeviceYear = 2015;
        if (clientOS == 0 && clientDeviceYear >= 2015){
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015){
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Для вашей операционной системы еще нет приложения.");
        }
    }

    public static void task3(){
        System.out.println("Задача 3");
        int year = 2023;
        int fourthYear = year % 4;
        int hundredYear = year % 100;
        int fourHundredYear = year % 400;
        if (year >=1584 && fourthYear == 0 && hundredYear >=1 || fourHundredYear == 0){
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void task4(){
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        int day = 1;
        if (deliveryDistance <= 20){
            System.out.println("Потребуется дней: " + day);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60){
            System.out.println("Потребуется дней: " + (day + 1));
        } else if (deliveryDistance > 60 && deliveryDistance <= 100){
            System.out.println("Потребуется дней: " + (day + 2));
        } else {
            System.out.println("Доставки нет");
        }
    }

    public static void task5(){
        System.out.println("Задача 5");
        int monthNumber = 3;
        switch (monthNumber){
            case 12:
                System.out.println("Декабрь - это месяц зимы.");
                break;
            case 1:
                System.out.println("Январь - это месяц зимы.");
                break;
            case 2:
                System.out.println("Февраль - это месяц зимы.");
                break;
            case 3:
                System.out.println("Март - это месяц весны.");
                break;
            case 4:
                System.out.println("Апрель - это месяц весны.");
                break;
            case 5:
                System.out.println("Май - это месяц весны.");
                break;
            case 6:
                System.out.println("Июнь - это месяц лета.");
                break;
            case 7:
                System.out.println("Июль - это месяц лета.");
                break;
            case 8:
                System.out.println("Август - это месяц лета.");
                break;
            case 9:
                System.out.println("Сентябрь - это месяц осени.");
                break;
            case 10:
                System.out.println("Октябрь - это месяц осени.");
                break;
            case 11:
                System.out.println("Ноябрь - это месяц осени.");
                break;
            default:
                System.out.println("В году 12 месяцев.");
        }
    }
}