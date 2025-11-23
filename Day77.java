public class main{
    public static void main(String[] args) {
        String kalimat = "   Halo, saya sedang belajar Java   ";

        
        String kalimatTrim = kalimat.trim();
        System.out.println("Kalimat Trim: " + kalimatTrim);

        
        String subString = kalimatTrim.substring(5, 10);
        System.out.println("Sub String: " + subString);

        
        String kalimatReplace = kalimatTrim.replace("Halo", "Hai");
        System.out.println("Kalimat Replace: " + kalimatReplace);

        
    }
}
