public class main {

    public static void main(String[] args) {
        
        int[] ID= {1001, 1002, 1003, 1004, 1005};

        System.out.println("--- Daftar ID--");

        
        for (int i = 0; i < ID.length; i++) {
            System.out.println("ID pada indeks ke-" + i + ": " + ID[i]);
        }

        
        System.out.println("\nID pertama dalam daftar adalah: " + ID[0]);
    }
}
