import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nomor hari (1-7): ");
        int hari = input.nextInt();

        

        switch (hari) {
            case 1:
                System.out.println(" hari 1 hari senin");
                break;
            case 2:
                System.out.println("hari  2 hari selasa");
                break;
            case 3:
                System.out.println(" hari  3 hari rabu");
                break;
            case 4:
                System.out.println(" hari 4  hari kamis");
                break;
            case 5:
                System.out.println("hari 5 hari jum,at");
                break;
            case 6:
                System.out.println("hari 6 hari sabtu ");
                break;
            case 7:
                System.out.println("hari 7 hari minggu");
                break;
            default:
                System.out.println("Nomor hari tidak valid");
                
        }

        
    }
