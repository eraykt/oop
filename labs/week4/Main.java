package labs.week4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        TryCatchLab();

        Scanner sc = new Scanner(System.in);

        Worker worker = new Worker();
        worker.SetName("eray");

        System.out.println("maas gir..:");

        double maas;
        try {
            maas = sc.nextDouble();
            if (maas < 0) {
                sc.close();
                throw new Exception("maas negatif olamaz");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        new Worker();
        new Worker();
        new Worker();
        new Worker();
        new Worker();

        worker.ShowWorkerCount();
    }

    private static void TryCatchLab() {
        System.out.println("bir adet TAM SAYI gir..:");
        Scanner sc = new Scanner(System.in);
        int tamSayi;
        try {
            tamSayi = sc.nextInt();
            System.out.println(tamSayi);

        } catch (InputMismatchException e) {
            System.out.println("hata mesaji: " + e);
        }
        sc.close();
    }

}
