import java.util.Scanner;
class fibbonaci{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        int n1=0;
        int n2=1;
        int nth;
        System.out.print("Jumlah : ");
        int jum=inp.nextInt();
        for(int count=0;count < jum;count++){
            System.out.println(n1);
            nth=n1+n2;
            n1=n2;
            n2=nth;
        }
        inp.close();
    }
}
