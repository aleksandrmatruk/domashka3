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
        int year = 20;

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                System.out.println(year + " год является високосным!");
            }
         else System.out.println(year + " год не является високосным!");






    }

    }

