import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	

        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("Menu");
            System.out.println("1.makanan");
            System.out.println("2.minuman");
            System.out.println("3.keluar");
           
            int pil = input.nextInt();
            input.nextLine();
            switch(pil){
                case 1:
                    System.out.println("anda memilih makanan");
                    System.out.print("masukkan nama makanan :");
                    String makanan =input.nextLine();
                    
                    System.out.println("anda memesan makanan "+ makanan);
                    break;
                case 2:    
                    System.out.println("anda memilih minuman");
                    System.out.print("masukkan nama minuman :");
                    String minuman =input.nextLine();
                    System.out.println("anda memesan minuman "+minuman);
                    break;
                case 3:
                System.out.println("anda memilih keluar");
                System.out.println("terima kasih ");
               break;
                default:
                    System.out.println("pilihan tidak valid ");
                    return;
            
        
    }
}
	}
}
