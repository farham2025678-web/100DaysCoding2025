import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int N = scanner.nextInt();

        System.out.println("Angka dari 1 hingga " + N + ":");
        for (int i = 1; i <= N; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\n\nAngka dari " + N + " hingga 1:");
        for (int i = N; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }
}
