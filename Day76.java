public class main{
    public static void main(String[] args) {
        
        String nama1 = "Farham";
        String nama2 = "FARHAM";
        String nama3 = "";

        
        boolean sama = nama1.equals(nama2);
        System.out.println("Nama1 dan Nama2 sama? " + sama);

        
        boolean samaIgnoreCase = nama1.equalsIgnoreCase(nama2);
        System.out.println("Nama1 dan Nama2 sama (ignore case)? " + samaIgnoreCase);

        
        String kalimat = "Saya sedang belajar Java";
        boolean mengandung = kalimat.contains("Java");
        System.out.println("Kalimat mengandung kata 'Java'? " + mengandung);

        
        boolean kosong = nama3.isEmpty();
        System.out.println("Nama3 kosong? " + kosong);
    }
}
