import java.util.Scanner;
class fungsi{
    public static void main(String args[]){
        int pilihan;
        Scanner inpNum = new Scanner(System.in);
        System.out.print("\n\t1. Luas Lingkaran\n\t2. Volume Balok\n\t3. Permukaan Kubus\nPilih : ");
        pilihan = inpNum.nextInt();
        switch(pilihan){
            case 1:
                System.out.println("Hasil : "+lLingkaran());
                break;
            case 2:
                System.out.println("Hasil : "+VolBalok());
                break;
            case 3:
                System.out.println("Hasil : "+PermukaanBalok());
                break;
            default:
                System.out.println(" Masukan Input Dengan Benar");
        }
        inpNum.close();
    }
    public static double lLingkaran(){
        Scanner inpNum = new Scanner(System.in);
        int r; // jari-jari
        double luasBalok;
        System.out.print("Jari : ");
        r = inpNum.nextInt(); //input
        luasBalok=Math.PI*Math.pow(r, 2);
        inpNum.close();
        return luasBalok;
    }
    public static int VolBalok(){
        Scanner inpNum = new Scanner(System.in);
        int panjang;
        int lebar;
        int tinggi;
        int volbalok;
        System.out.print("Panjang : ");
        panjang = inpNum.nextInt();
        System.out.print("Lebar : ");
        lebar = inpNum.nextInt();
        System.out.print("Tinggi : ");
        tinggi = inpNum.nextInt();
        volbalok = panjang*lebar*tinggi;
        inpNum.close();
        return volbalok;
    }
    public static double PermukaanBalok(){
        int sisi;
        double hasil;
        Scanner inpNum = new Scanner(System.in);
        System.out.print("Sisi : ");
        sisi = inpNum.nextInt();
        hasil=6*Math.pow(sisi, 2);
        inpNum.close();
        return hasil;
        
    }
}
