import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai M: ");
        int M = scanner.nextInt();
        System.out.print("Masukkan nilai N: ");
        int N = scanner.nextInt();

        int hasil = 1;
        for (int i = 1; i <= N; i++) {
            hasil *= M;
        }
        System.out.println(M+ " pangkat " + N+ " adalah: " + hasil);
    }
}
