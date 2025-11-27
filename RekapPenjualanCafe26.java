import java.util.Scanner;

public class RekapPenjualanCafe26 {

    static String[] daftarMenu= {
        "Kopi Hitam", 
        "Cappuccino",
        "Latte\t", 
        "Teh Tarik ", 
        "Roti Bakar"
    };

    public static void inputPenjualan(int penjualan[][]) {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("==== INPUT DATA PENJUALAN ====");
        for (int i=0; i<daftarMenu.length; i++) {
            System.out.println("Menu: "+daftarMenu[i]);
            for (int j=0; j<7; j++) {
                System.out.print(" Hari ke-"+(j+1)+": ");
                penjualan[i][j]= sc.nextInt();
            }
        }
    }

    public static void tampilanPenjualan(int penjualan[][]) {
        System.out.println("\n========================== DATA PENJUALAN ==========================");
        System.out.println("MENU\t\tH1\tH2\tH3\tH4\tH5\tH6\tH7");

        for (int i=0; i<daftarMenu.length; i++) {
            System.out.print(daftarMenu[i]+"\t");
            for (int j=0; j<7; j++) {
                System.out.print(penjualan[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public static void penjualanTertinggi(int penjualan[][]) {
        int tertinggi= -1;
        int menuTertinggi=0;

        for (int i=0; i<daftarMenu.length; i++) {
            int total=0;
            for (int j=0; j<7; j++) {
                total+=penjualan[i][j];
            }
            if (total>tertinggi) {
            tertinggi=total;
            menuTertinggi=i;
            }
        }

        System.out.println("\n===== MENU TERTINGGI =====");
        System.out.println("Menu\t\t: "+daftarMenu[menuTertinggi]);
        System.out.println("Total penjualan\t: "+tertinggi);
    }

    public static void rataPenjualan(int penjualan [][]) {
        System.out.println("\n==== RATA-RATA PENJUALAN ====");
        for (int i=0; i<daftarMenu.length; i++) {
            int total=0;
            for (int j=0; j<7; j++) {
                total+=penjualan[i][j];
            }
            double rata= total/7;
            System.out.println(daftarMenu[i]+"\t: "+rata);
        }
    }

    public static void main(String[] args) {
        int penjualan [][]= new int[5][7];

        inputPenjualan(penjualan);
        tampilanPenjualan(penjualan);
        penjualanTertinggi(penjualan);
        rataPenjualan(penjualan);

    }
}
