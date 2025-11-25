import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = "";
        String password = "";

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Buat Akun");
            System.out.println("2. Login");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            int menu = scanner.nextInt();
            scanner.nextLine(); 

            switch (menu) {
                case 1:
                    System.out.print("Masukkan username: ");
                    username = scanner.nextLine();
                    System.out.print("Masukkan password: ");
                    password = scanner.nextLine();
                    System.out.println("Akun berhasil dibuat!");
                    break;
                case 2:
                    if (username.isEmpty() || password.isEmpty()) {
                        System.out.println("Anda belum membuat akun!");
                    } else {
                        while (true) {
                            System.out.print("Masukkan username: ");
                            String usernameInput = scanner.nextLine();
                            System.out.print("Masukkan password: ");
                            String passwordInput = scanner.nextLine();

                            if (usernameInput.equals(username) && passwordInput.equals(password)) {
                                System.out.println("Login berhasil!");
                                return;
                            } else {
                                System.out.println("Username atau password salah!");
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.println("Terima kasih!");
                    return;
                default:
                    System.out.println("Menu tidak valid!");
            }
        }
    }
}
