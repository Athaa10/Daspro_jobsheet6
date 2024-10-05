import java.util.Scanner;
public class Latihan2daspro6_03 {
    public static void main(String[] args) {
        Scanner absen03 = new Scanner(System.in);

        int hari;
        double diskon = 0;
        

        System.out.println("-------------------");
        System.out.println("==== TOKO BUKU ====");
        System.out.println("-------------------");
        System.out.println("Apakah hari ini hari Rabu?");
        System.out.println("1. Kamus");
        System.out.println("2. Novel");
        System.out.println("3. Buku selain kamus dan novel");
        System.out.println("------------------------------");

        System.out.print("Apakah hari ini Rabu (y/n) ? = ");
        String hari_ini = absen03.nextLine();
        System.out.print("Masukkan angka dari buku yang dipilih = ");
        int pilihan_buku = absen03.nextInt();
        System.out.print("Masukkan jumlah buku yang dibeli = ");
        int jumlah_buku = absen03.nextInt();
        absen03.nextLine(); 
        System.out.println("--------------------------------------");

        if (hari_ini.equalsIgnoreCase("y")) {
            if (pilihan_buku == 1) {
                diskon = 0.10;
                if (jumlah_buku > 2) {
                    diskon = 0.10 + 0.2;
                } else {
                    diskon = 0.10;
                } System.out.println("Jumlah diskon yang didapat = " + diskon);

            } else if (pilihan_buku == 2) {
                if (pilihan_buku == 2) {
                diskon = 0.7;
                if (jumlah_buku > 3)
                    diskon = 0.7 + 0.2;
                } else {
                    diskon = 0.7 + 0.1;
                } System.out.println("Jumlah diskon yang didapat = " + diskon);

            } else if (pilihan_buku == 3) {
            if (pilihan_buku > 3) {
                diskon = 0.5;
            } else {
                diskon = 0;
                System.out.println("Tidak dapat diskon");
            } System.out.println("Jumlah diskon yang didapat = " + diskon);

        } else if  (hari_ini.equalsIgnoreCase("n")) {
            System.out.println("Tak dapat diskon");
        }
    }

    }
}