import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        int n = scanner.nextInt();
        int faktorial = 1;
        for (int i = 1; i <= n; i++) {
            faktorial *= i;
        }
        System.out.println(n + "! = " + faktorial);
    }
}
