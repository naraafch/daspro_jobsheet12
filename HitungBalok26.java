import java.util.Scanner;

public class HitungBalok26 {

    static int hitungLuas(int pjg, int lbr) {
        int Luas= pjg*lbr;
        return Luas;
    }

    static int hitungVolume(int a, int b, int tinggi) {
        int volume= hitungLuas(a, b)*tinggi;
        return volume;
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int p, l, t, L, vol;

        System.out.println("Masukkan panjang");
        p= input.nextInt();

        System.out.println("Masukkan lebar");
        l= input.nextInt();

        System.out.println("Masukkan tinggi");
        t= input.nextInt();

        L= hitungLuas(p, l);
        System.out.println("Luas persegi panjang adalah "+L);
        vol= hitungVolume(p, l, t);
        System.out.println("Volume balok adalah "+vol);

        input.close();
    }
    
}
