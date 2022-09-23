import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numberOne, numberTwo, select;

        Scanner input = new Scanner(System.in);

        System.out.println("İlk Sayıyı Giriniz : ");
        numberOne = input.nextInt();

        System.out.println("İkinci Sayısı Giriniz : ");
        numberTwo = input.nextInt();

        System.out.println("Yapmak İstediğiniz İşlemi Seçiniz?" +
                " \n1-Toplama :\n2-Çıkarma :\n3-Çarpma :\n4-Bölme :");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.println("Toplama İşlem Sonucunuz : " + (numberOne + numberTwo));
                break;
            case 2:
                System.out.println("Çıkarma İşlem sonucunuz : " + (numberOne - numberTwo));
                break;
            case 3:
                System.out.println("Çarpma İşlem Sonucunuz : " + (numberOne * numberTwo));
                break;

            case 4:
                if (numberTwo != 0)
                System.out.println("Bölme İşlem Sonucunuz : " + (numberOne / numberTwo));
                else
                    System.out.println("Bir Sayı 0'a Bölünemez!!Lütfen Yeni Bir Sayı Giriniz..");
                break;

            default:
                System.out.println("Hatalı Bir Seçim Yaptınız !! Lütfen Tekrar Deneyiniz..");


        }

    }
}