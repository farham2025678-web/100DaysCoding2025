import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        boolean adaI = false;
        boolean adaS = false;
        boolean adaC = false;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == 'I' && !adaI) {
                adaI = true;
            } else if (ch == 'S' && adaI && !adaS) {
                adaS = true;
            } else if (ch == 'C' && adaI && adaS) {
                adaC = true;
                break;
            }
        }

        if (adaI && adaS && adaC) {
            System.out.println("CANTIK");
        } else {
            System.out.println("TIDAK CANTIK");
        }
    }
}
