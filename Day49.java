import java.util.Scanner;
  public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        int nilai = scanner.nextInt();

        String hasil = nilai  >=80 ?"Lulus" : "Gagal";
        System.out.println("Hasil: " + hasil);

       
    }

	}
