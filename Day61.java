import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int N = scanner.nextInt();
        System.out.print("Masukkan nilai M: ");
        int M = scanner.nextInt();

        System.out.println("Bilangan kelipatan " + M + " dari 1 hingga " + N + ":");
        for (int i = 1; i <= N; i++) {
            if (i % M == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
	
