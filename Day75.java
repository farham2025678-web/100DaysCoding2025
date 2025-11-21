public class StringMethod {
    public static void main(String[] args) {
        
        String nama = "Farham.A";

       
        int panjang = nama.length();
        System.out.println("Panjang string: " + panjang);

        
        String namaUpper = nama.toUpperCase();
        System.out.println("String dalam uppercase: " + namaUpper);

        
        String namaLower = nama.toLowerCase();
        System.out.println("String dalam lowercase: " + namaLower);
    }
}
