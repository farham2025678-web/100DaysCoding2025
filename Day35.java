import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
       Scanner input = new Scanner(System.in);
        System.out.print("Masukkan umur Anda: ");
        int umur = input.nextInt();

        if (umur >= 18) {
            System.out.println("Anda sudah dewasa");
        } else {
            System.out.println("Anda masih anak-anak");
        }
    
}
	
}
