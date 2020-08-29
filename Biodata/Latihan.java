import java.util.Scanner;
class Latihan {
	public static void main(String args[]){
			Scanner myInpObj=new Scanner(System.in);
			System.out.println("------Biodata--------");
			System.out.print("Nama : ");
			String nama=myInpObj.nextLine();
			System.out.print("Umur : ");
			int umur=myInpObj.nextInt();
			System.out.println("---------------------");
			System.out.println("Nama Kamu Adalah "+nama+" umur "+umur+" Tahun");
			myInpObj.close();
		}
	}
