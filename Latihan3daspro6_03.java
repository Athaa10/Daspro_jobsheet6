import java.util.Scanner;
public class Latihan3daspro6_03 {

    public static void main(String[] args) {
        Scanner absen03 = new Scanner (System.in);
        //Scanner input19 = new Scanner (System.in);

        String merkSepatu, kategori;
        int ukuran = 0, harga = 0;

        System.out.println ("Masukkan merk sepatu (Converse / Sketcher / Nike): ");
        merkSepatu = absen03.next();

        if (merkSepatu.equalsIgnoreCase("converse")) {
            System.out.println("Masukkan kategori (Slip On / High Top): ");
            kategori = absen03.next();
           
            Scanner input = new Scanner (System.in);
             if (kategori.equalsIgnoreCase("Slip On")) {
                
                System.out.print("Masukkan ukuran sepatu (36-40): ");
                input.nextInt();
                ukuran = input.nextInt();
                harga = 800000;
                
             } else if (kategori.equalsIgnoreCase("HighTop")) {
                System.out.println("Masukkan ukuran sepatu (41-44): ");
                ukuran = input.nextInt();
                harga = 1200000;
                
             }
        } else if (merkSepatu.equalsIgnoreCase("Sketcher")) {
            System.out.println("Masukkan kategori (woman / man): ");
            kategori = absen03.next();

            if (kategori.equalsIgnoreCase("woman")) {
                System.out.println("Masukkan ukuran sepatu (36-40): ");
                ukuran = absen03.nextInt();
                harga = 1000000;
                
            } else if (kategori.equalsIgnoreCase("man")) {
                System.out.println("Masukkan ukuran (41-44): ");
                ukuran = absen03.nextInt();
                harga = 1800000;
                
            }
        } else if (merkSepatu.equalsIgnoreCase("Nike")) {
            System.out.println("Masukkan kategori sepatu (kids / adult): ");
            kategori = absen03.next();
            if (kategori.equalsIgnoreCase("kids")) {
                System.out.println("Masukkan ukuran sepatu (36-40): ");
                ukuran = absen03.nextInt();
                harga = 700000;
                
            } else if (kategori.equalsIgnoreCase("adult")) {
                System.out.println("Masukkan ukuran sepatu (40-44): ");
                ukuran = absen03.nextInt();
                harga = 1500000;
                
            }
            
        } else {
            System.out.println("Merk sepatu tidak tersedia");
            return;
        }
        System.out.println("Sepatu yang dipilih " + merkSepatu);
        System.out.println("Ukuran yang dipilih " + ukuran);
        System.out.println("Total harga Rp." + harga);
        
    }
}