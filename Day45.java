import java.util.Scanner;
public class main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
                
            System.out.print("Masukan pilihan (1.untuk makanan 2.untuk minuman)");
            int pil = input.nextInt();
            input.nextLine();
            switch(pil){
                case 1:
                    System.out.print("mau pesan makanan apa : ");
                    String makanan = input.nextLine();
                   System.out.println(" anda memesan makanan :"+makanan);
                    break;
                case 2:    
                    System.out.print("mau pesan  minuman apa : ");
                    String minuman = input.nextLine();
                    System.out.println("anda memesan minuman :"+minuman);
   
                    break;
                default:
                    System.out.println("pilihan tidak tersedia");
                    
              
            }
        }
    }
