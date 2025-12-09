import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai desimal: ");
        double nilai = scanner.nextDouble();

        System.out.println("Ceil: " + Math.ceil(nilai));
        System.out.println("Floor: " + Math.floor(nilai));
        System.out.println("Round: " + Math.round(nilai));
    }
}
