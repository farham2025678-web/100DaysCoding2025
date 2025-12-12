import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        double a = scanner.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double b = scanner.nextDouble();

        System.out.println("Hasil penjumlahan: " + tambah(a, b));
        System.out.println("Hasil pengurangan: " + kurang(a, b));
        System.out.println("Hasil perkalian: " + kali(a, b));

        if (b == 0) {
            System.out.println("Hasil pembagian: Tidak dapat membagi dengan nol!");
        } else {
            System.out.println("Hasil pembagian: " + bagi(a, b));
        }
    }

    public static double tambah(double a, double b) { return a + b; }
    public static double kurang(double a, double b) { return a - b; }
    public static double kali(double a, double b) { return a * b; }
    public static double bagi(double a, double b) { return a / b; }
}
