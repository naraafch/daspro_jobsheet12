import java.util.Scanner;

public class NilaiMahasiswa26 {
    
    public static void isianArray(int nilai[]) {
        Scanner sc= new Scanner (System.in);
        for (int i=0; i<nilai.length; i++) {
            System.out.print("\nMasukkan nilai mahasiswa ke-" +(i+1)+": ");
            nilai[i]= sc.nextInt();
        }
    }

    public static void tampilArray(int nilai[]) {
        System.out.println("\n===== DAFTAR NILAI MAHASISWA =====");
        for (int i=0; i<nilai.length; i++) {
            System.out.println((i+1)+". "+nilai[i]);
        }
    }

    public static int hitTot (int nilai[]) {
        int total=0;
        for (int i=0; i<nilai.length; i++) {
            total+=nilai[i];
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Jumlah Mahasiswa: ");
        int mhs= sc.nextInt();
        System.out.print("=================================");
        
        int nilaiMhs[]= new int[mhs];

        isianArray(nilaiMhs);
        tampilArray(nilaiMhs);
        int totalNilai= hitTot(nilaiMhs);
        System.out.println("=================================");
        System.out.println("Total nilai mahasiswa: "+totalNilai);

    }
}
