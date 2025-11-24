import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kalimat: ");
        String kalimat = scanner.nextLine();

        
        System.out.println("Panjang kalimat: " + kalimat.length());

        
        System.out.print("Masukkan index karakter: ");
        int index = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("Karakter pada index " + index + ": " + kalimat.charAt(index));

        
        System.out.print("Masukkan index awal substring: ");
        int indexAwal = scanner.nextInt();
        System.out.print("Masukkan index akhir substring: ");
        int indexAkhir = scanner.nextInt();
        scanner.nextLine(); 
        
        System.out.println("Substring: " + kalimat.substring(indexAwal, indexAkhir));

        
        System.out.print("Masukkan string yang ingin diganti: ");
        String stringGanti = scanner.nextLine();
        System.out.print("Masukkan string pengganti: ");
        String stringPengganti = scanner.nextLine();
        System.out.println("Kalimat setelah diganti: " + kalimat.replace(stringGanti, stringPengganti));

        
        System.out.println("Kalimat dalam uppercase: " + kalimat.toUpperCase());
        System.out.println("Kalimat dalam lowercase: " + kalimat.toLowerCase());

        
        System.out.println("Kalimat setelah di-trim: " + kalimat.trim());

        
        System.out.print("Masukkan kalimat lain: ");
        String kalimatLain = scanner.nextLine();
        System.out.println("Apakah kalimat sama? " + kalimat.equals(kalimatLain));
        System.out.println("Apakah kalimat sama (ignore case)? " + kalimat.equalsIgnoreCase(kalimatLain));
    }
}
