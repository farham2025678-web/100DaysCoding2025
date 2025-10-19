import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);

        System.out.print("Gaji Pokok: ");
        double gajiPokok=input.nextDouble();

        System.out.print("Pajak (%): ");
        double pajak= input.nextDouble();

        double gajiBersih = gajiPokok - (gajiPokok * pajak / 100);

        System.out.println("Gaji Bersih: " + gajiBersih);
    }
}
