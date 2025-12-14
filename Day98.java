import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int n = scanner.nextInt();

        int a = 0;
        int b = 1;
        for (int i = 1; i <= n; i++) {
            int c = a + b;
            System.out.print(b + " ");
            a = b;
            b = c;
        }
    }
}
