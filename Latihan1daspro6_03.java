import java.util.Scanner;
public class Latihan1daspro6_03 {
    public static void main(String[] args) {
        Scanner absen03 = new Scanner (System.in);

        System.out.print("Masukkan Bilangan 1: ");
        int bilangan1 = absen03.nextInt();
        System.out.print("Masukkan Bilangan 2: ");
        int bilangan2 = absen03.nextInt();
        System.out.print("Masukkan Bilangan 3: ");
        int bilangan3 = absen03.nextInt();

        if (bilangan1>bilangan2) {
            System.out.println("Bilangan terbesar = " + bilangan1);
        } else if (bilangan1>bilangan3) {
            System.out.println("Bilangan terbesar = " + bilangan2);
        } else {
            System.out.println("Bilangan terbesar = " + bilangan3);
        }
    

    }
}