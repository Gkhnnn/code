package day12;

import java.util.Scanner;

public class SwicthExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir ay giriniz ");
        int ayNo = scan.nextInt();

        switch (ayNo){
            case 12:
            case 1:
            case 2:
                System.out.println("Kış Mevsimi");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("İlkbahar mevsimi");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Yaz Mevsimi");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Sonbahar Mevsimi");
                break;
            default:
                System.out.println("Böyle bir mevsim yok");



        }

    }
}
