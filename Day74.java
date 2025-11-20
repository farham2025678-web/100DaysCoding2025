import java.util.Scanner;

public class  main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("Menu Utama");
            System.out.println("1. Lihat Data");
            System.out.println("2. Tambah Data");
            System.out.println("3. Hapus Data");
            System.out.println("4. Keluar");
            System.out.print("Masukkan pilihan: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Lihat Data");
                    break;
                case 2:
                    System.out.println("Tambah Data");
                    break;
                case 3:
                    System.out.println("Hapus Data");
                    break;
                case 4:
                    System.out.println("Keluar");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (pilihan != 4);
    }
}
