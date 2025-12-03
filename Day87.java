import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
         Scanner input= new Scanner(System.in);
         int[] array = {1,2,4,5,6,7,8,9,10};

        System.out.print("Masukkan nilai yang ingin dicari: ");
        int target = input.nextInt();

        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                System.out.println("Elemen " + target + " ditemukan pada indeks ke-" + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Elemen " + target + " tidak ditemukan");
        }
    }
}
