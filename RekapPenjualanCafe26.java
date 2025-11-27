import java.util.Scanner;

public class RekapPenjualanCafe26 {

    static String[] daftarMenu;

    public static void inputMenu(int jumlahMenu) {
        Scanner sc= new Scanner(System.in);
        daftarMenu= new String[jumlahMenu];

        System.out.println("===== INPUT NAMA MENU =====");
            for (int i=0; i<jumlahMenu; i++)  {
                System.out.print("Menu ke-"+(i+1)+": ");
                daftarMenu[i]= sc.nextLine();  
            }
            System.out.println();
    }

    public static void inputPenjualan(int penjualan[][], int jumlahHari) {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("==== INPUT DATA PENJUALAN ====");
        for (int i=0; i<daftarMenu.length; i++) {
            System.out.println("Menu: "+daftarMenu[i]);
            for (int j=0; j<jumlahHari; j++) {
                System.out.print(" Hari ke-"+(j+1)+": ");
                penjualan[i][j]= sc.nextInt();
            }
        }
    }

    public static void tampilanPenjualan(int penjualan[][], int jumlahHari) {
        System.out.println("\n========================== DATA PENJUALAN ==========================");
        System.out.print("MENU\t\t");
        for (int i=0; i<jumlahHari; i++) {
            System.out.print("H"+(i+1)+"\t");
        }
        System.out.println();
                
        for (int i=0; i<daftarMenu.length; i++) {
            System.out.print(daftarMenu[i]+"\t");
            for(int j=0; j<jumlahHari; j++) {
                System.out.print(penjualan[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public static void penjualanTertinggi(int penjualan[][], int jumlahHari) {
        int tertinggi= -1;
        int menuTertinggi=0;

        for (int i=0; i<daftarMenu.length; i++) {
            int total=0;
            for (int j=0; j<jumlahHari; j++) {
                total+=penjualan[i][j];
            }
            if (total>tertinggi) {
            tertinggi=total;
            menuTertinggi=i;
            }
        }

        System.out.println("\n====== MENU TERTINGGI ======");
        System.out.println("Menu\t\t: "+daftarMenu[menuTertinggi]);
        System.out.println("Total penjualan\t: "+tertinggi);
    }

    public static void rataPenjualan(int penjualan [][], int jumlahHari) {
        System.out.println("\n==== RATA-RATA PENJUALAN ====");
        for (int i=0; i<daftarMenu.length; i++) {
            int total=0;
            for (int j=0; j<jumlahHari; j++) {
                total+=penjualan[i][j];
            }
            int rata= total/jumlahHari;
            System.out.println(daftarMenu[i]+"\t: "+rata);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Masukkan jumlah menu\t\t: ");
        int jumlahMenu= sc.nextInt();
        System.out.print("Masukkan jumlah hari penjualan\t: ");
        int jumlahHari= sc.nextInt();
        System.out.print("\n");

        inputMenu(jumlahMenu);
        int penjualan [][]= new int[jumlahMenu][jumlahHari];

        inputPenjualan(penjualan, jumlahHari);
        tampilanPenjualan(penjualan, jumlahHari);
        penjualanTertinggi(penjualan, jumlahHari);
        rataPenjualan(penjualan, jumlahHari);

    }
}
