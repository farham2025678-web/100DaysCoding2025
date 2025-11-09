import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	  int jumlah = 1;
		int N = input.nextInt();
	for(int i = 1; i<= N;i++){
	    
	    jumlah*=i;
	    
	}System.out.println(jumlah);
	}
}
