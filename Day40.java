import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kalkulator ");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");

        System.out.print("Pilih operasi : ");
        int pilihan = scanner.nextInt();
        System.out.print("Masukkan angka pertama: ");
        double angka1 = scanner.nextDouble();
        System.out.print("Masukkan angka kedua: ");
        double angka2 = scanner.nextDouble();
        if (pilihan == 1) {
            System.out.println("Hasil penjumlahan : " + (angka1 + angka2));
        } else if (pilihan == 2) {
            System.out.println("Hasil pengurangan: " + (angka1 - angka2));
        } else if (pilihan == 3) {
            System.out.println("Hasil perkalian: " + (angka1 * angka2));
        } else if (pilihan == 4) {
            if (angka2 != 0) {
                System.out.println("Hasil pembagian: " + (angka1 / angka2));
            } else {
                System.out.println("Error: Pembagian dengan nol!");
            }
        } else {
            System.out.println("Pilihan tidak valid");
        }
    }
}
