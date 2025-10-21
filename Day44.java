import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        int nilai = scanner.nextInt();

       
        if (nilai >= 90 && nilai <= 100) {
            System.out.println("A");
        } 
        else if (nilai >= 80 && nilai < 90) {
            System.out.println("B");
        } else if (nilai >= 70 && nilai < 80) {
            System.out.println("C");
        } else if (nilai >= 60 && nilai < 70) {
            System.out.println("D");
        } else {
            System.out.println("E");
                
        }

        
    }
}
