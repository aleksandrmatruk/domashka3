package ru.skypro;

public class Main {

    public static void main(String[] args) {

        //задание 1
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке ");
        } else {
            System.out.println("Установите версию приложения для AndroidOS по ссылке");
        }
        //задание 2
        int clientDeviceYear = 2014;
        boolean versionPO = clientDeviceYear <= 2014 && clientOS == 0;

        if (versionPO) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if( versionPO = clientDeviceYear <= 2014 && clientOS == 1){
            System.out.println("Установите облегченную версию приложения для AndroidOS по ссылке");
        }
        System.out.println();

        //задание 3
        int year = 2100;

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                System.out.println(year + " год является високосным!");
            }
         else System.out.println(year + " год не является високосным!");

        // задание 4

        int deliveryDistance = 90;
        int deliveryDay = 1;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + deliveryDay);}

        else {
                if (deliveryDistance >20 && deliveryDistance < 60) { deliveryDay = deliveryDay+1;
                    System.out.println("Потребуется дней: " + deliveryDay);}
        }

         if (deliveryDistance >60 && deliveryDistance < 100) { deliveryDay = deliveryDay+2;
            System.out.println("Потребуется дней: " + deliveryDay);
         }

         // задание 5

        int monthNumber = 13;
         switch (monthNumber) {
             case 1:
                 System.out.println("Январь принадлежит к сезону ЗИМА");
                 break;
             case 2:
                 System.out.println("Февраль принадлежит к сезону ЗИМА");
                 break;
             case 3:
                 System.out.println("Март принадлежит к сезону ВЕСНА");
                 break;
             case 4:
                 System.out.println("Апрель принадлежит к сезону ВЕСНА");
                 break;
             case 5:
                 System.out.println("Май принадлежит к сезону ВЕСНА");
                 break;
             case 6:
                 System.out.println("Июнь принадлежит к сезону ЛЕТО");
                 break;
             case 7:
                 System.out.println("Июль принадлежит к сезону ЛЕТО");
                 break;
             case 8:
                 System.out.println("Август принадлежит к сезону ЛЕТО");
                 break;
             case 9:
                 System.out.println("Сентябрь принадлежит к сезону ОСЕНЬ");
                 break;
             case 10:
                 System.out.println("Октябрь принадлежит к сезону ОСЕНЬ");
                 break;
             case 11:
                 System.out.println("Ноябрь принадлежит к сезону ОСЕНЬ");
                 break;
             case 12:
                 System.out.println("Декабрь принадлежит к сезону ЗИМА");
                 break;
             default:
                 System.out.println("Это точно не земной год!");

         }
         }




    }



