import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	  int jumlah = 0;
		int N = input.nextInt();
	for(int i = 1; i<= N;i++){
	    int a = input.nextInt();
	    jumlah+=a;
	    
	}System.out.println(jumlah);
	}
}
