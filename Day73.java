import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        while (true) {
            System.out.print("Masukkan angka pertama : ");
            int angka1 = scanner.nextInt();
            if (angka1 < 0) break;

            System.out.print("Masukkan angka kedua : ");
            int angka2 = scanner.nextInt();
            if (angka2 < 0) break;

           int jumlah = angka1 + angka2;
            System.out.println("Hasil penjumlahan:  " + jumlah);
        }
    }
}
