import java.util.Scanner;;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(true){
		System.out.println("pilih operasi");
		System.out.println("1.penjumlahan");
		System.out.println("2.pengurangan");
		System.out.println("3.perkalian");
		System.out.println("4.pembagian");
		System.out.print("masukkan pilihan :");
		int pilihan =input.nextInt();
		System.out.print("masukkan angka 1 :");
		double angka1=input.nextDouble();
		System.out.print("masukkan angka 2 :");
		double angka2=input.nextDouble();
		switch(pilihan){
		    case 1 :
		    System.out.println(angka1+angka2);
		    break;
		    case 2 :
		    System.out.println(angka1-angka2);
		    break;
		    case 3 : 
		    System.out.println(angka1*angka2);
		    break;
		    case 4 :
		    
		    if (angka2!=0){
		        System.out.println(angka1/angka2);
		    }else{
		        System.out.println("tidak bisa dibagi 0");
		    }
		    break;
		    default :
		    System.out.println("pilihan tidak tersedia");
		    
		}
		}
	}
}
