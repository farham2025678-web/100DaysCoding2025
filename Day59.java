import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner i= new Scanner(System.in);
		int N = i.nextInt();
		System.out.println("ganjil");
		for(int j= 1;j<=N ;j++){
		    if(j%2==1){
		        
		    System.out.println(j);
		    }
		}System.out.println("genap");
		
		for(int  j= 1;j<=N;j++){
		    if(j%2==0){
		        System.out.println(j);
		    }
		}
	}
}
