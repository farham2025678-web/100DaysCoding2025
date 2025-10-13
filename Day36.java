import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int nilai = input.nextInt();

if (nilai >= 80) {
    if (nilai >= 90) {
        System.out.println("Nilai Anda A");
    } else {
        System.out.println("Nilai Anda B");
    }
} else {
    System.out.println("Nilai Anda tidak memenuhi syarat");
}
	}
