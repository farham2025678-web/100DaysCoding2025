import java.util.Scanner;
public class Main {
	public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = scanner.nextInt();

        String hasil = angka %2==0? "genap" : "Ganjil";
        System.out.println(hasil);
    }

	
}
