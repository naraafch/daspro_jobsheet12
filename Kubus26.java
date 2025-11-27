import java.util.Scanner;

public class Kubus26 {
    static int hitungVolume(int s) {
        int vol= s*s*s;
        return vol;
    }

    static int hitungLPermukaan(int s) {
        int LPermukaan= s*s*6;
        return LPermukaan;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Masukkan panjang sisi kubus\t: ");
        int sisi= sc.nextInt();

        int volume= hitungVolume(sisi);
        System.out.println("Volume kubus\t\t\t: "+volume);
        int luas= hitungLPermukaan(sisi);
        System.out.println("luas permukaan kubus\t\t: "+luas);
    }
    
}
