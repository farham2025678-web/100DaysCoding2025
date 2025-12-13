import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sisi: ");
        int s = scanner.nextInt();
        System.out.println("Luas: " + luas(s));
    }

    public static int luas(int s) {
        return s * s;
    }
}
