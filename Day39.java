 import java.util.Scanner;
 public class Main {
	public static void main(String[] args) {
		

        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu:");
        System.out.println("1. Makan");
        System.out.println("2. Minum");
        
        System.out.print("Pilih menu :");
        int pilihan = scanner.nextInt();

        if (pilihan == 1) {
            System.out.println("Anda memilih makan. Selamat makan!");
        } else if (pilihan == 2) {
            System.out.println("Anda memilih minum. Selamat minum!");
        } else {
            System.out.println("pilihan tidak tersedia");
        }
    }
}
	
