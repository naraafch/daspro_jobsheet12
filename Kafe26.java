import java.util.Scanner;

public class Kafe26 {
    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang, " +namaPelanggan+ "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        if (kodePromo.equals("DISKON50")) {
            System.out.println("Anda mendapat diskon 50%");
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Anda mendapat diskon 50%");
        } else {
            System.out.println("Kode promo invalid!");
        }

        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15.000");
        System.out.println("2. Cappuccio - Rp 20.000");
        System.out.println("3. Latte - Rp 22.000");
        System.out.println("4. Teh Tarik Rp 12.00");
        System.out.println("5. Roti Bakar - Rp 10.000");
        System.out.println("6. Mie Goreng - Rp 18.000");
        System.out.println("===========================");
        System.out.println("Silahkan pilih menu yang Anda inginkan");
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Menu("Budi", true, "DISKON30");
        
        System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
        int pilihanMenu= sc.nextInt();
        System.out.print("MAsukkan jumlha item yang ingin dipesan: ");
        int banyakItem= sc.nextInt();

        int totalHarga= hitungTotalHarga(pilihanMenu, banyakItem);

        System.out.print("Total harga untuk pesanan Anda: Rp"+totalHarga);

    }

    public static int hitungTotalHarga(int pilihanMenu, int banyakItem) {
        int[] hargaItem= {15000, 20000, 22000, 12000, 10000, 18000};

        int hargaTotal= hargaItem[pilihanMenu-1]*banyakItem;
        return hargaTotal;
    }



}