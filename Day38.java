import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("masukkan angka :");
		int angka = input.nextInt();
		if(angka>0){
		    System.out.println("positif");
		}else if(angka<0){
		    System.out.println("negatif");
		}else{
		    System.out.println("nol");
		}
	}
}
