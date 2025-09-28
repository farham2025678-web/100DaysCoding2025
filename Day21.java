public class Main {
	public static void main(String[] args) {
		int a = 2;
int b = 10;

System.out.println("Sebelum ditukar : a = " + a + ", b = " + b);

// Langkah-langkah penukaran
a = a + b; // a sekarang 12(2+ 10)
b = a - b; // b sekarang 2(12 - 10)
a = a - b; // a sekarang 10 (12- 2)

System.out.println("ditukar : a = " + a + ", b = " + b);  
	}
}
