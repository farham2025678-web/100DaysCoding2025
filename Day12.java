import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner biodata= new Scanner (System.in);
		System.out.print(" NAMA= ");
		String nama= biodata.nextLine();
		System.out.print(" NIM = ");
		String nim = biodata.nextLine();
		System.out.print(" ALAMAT = ");
		String alamat = biodata.nextLine();
	
		System.out.println("nama\t : " + nama);
		System.out.println(" nim\t : " + nim);
	    System.out.println("alamat\t : " + alamat);
	}
}
