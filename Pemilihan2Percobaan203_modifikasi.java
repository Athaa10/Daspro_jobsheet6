import java.util.Scanner;
public class Pemilihan2Percobaan203_modifikasi {
    public static void main(String[] args) {
        Scanner absen03 = new Scanner(System.in);

        double diskon = 0.0;
        int harga = 0;
        double total_bayar = 0.0;

        System.out.println("-----------------------");
        System.out.println("==== MENU KAFE JTI ====");
        System.out.println("-----------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling (Ricebowl + Ice Tea)");
        System.out.println("--------------------------------------");

        System.out.print("Masukkan angka dari menu yang dipilih = ");
        int pilihan_menu = absen03.nextInt();
        absen03.nextLine(); 
        System.out.print("Apakah punya member (y/n) ? = ");
        String member = absen03.nextLine();
        System.out.print("Pembayaran pakai Qris (y/n) ? = ");
        String pembayaran = absen03.nextLine();
        System.out.println("--------------------------------------");
        if (pembayaran.equalsIgnoreCase("y"))  {
        } 
        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);
            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);
            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " + harga);
            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }
            total_bayar = harga - (harga * diskon);
            double potongan = total_bayar - 1000;
            System.out.println("Total bayar setelah diskon = " + potongan);
        } else if (member.equalsIgnoreCase("n")) {
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);
            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);
            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " + harga);
            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }
            System.out.println("Total bayar = " + harga);
        } else {
            System.out.println("Member tidak valid");
        }
        System.out.println("--------------------------------");
    }
}
