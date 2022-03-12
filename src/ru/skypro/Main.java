package ru.skypro;

public class Main {

    public static void main(String[] args) {
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке ");
        } else {
            System.out.println("Установите версию приложения для AndroidOS по ссылке");
        }

        int clientDeviceYear = 2014;
        boolean versionPO = clientDeviceYear <= 2014 && clientOS == 0;

        if (versionPO) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if( versionPO = clientDeviceYear <= 2014 && clientOS == 1){
            System.out.println("Установите облегченную версию приложения для AndroidOS по ссылке");
        }
    }
}
