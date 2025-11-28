import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];

      
        for (int i = 0; i < array.length; i++) {
            System.out.print("Masukkan elemen ke-" + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

    
        System.out.println("Elemen array:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Elemen ke-" + (i + 1) + ": " + array[i]);
        }
    }
}
