public class Main {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                System.out.println(i + " kelipatan 3");
                            
            }     
           }
          
        for (int i = 1; i <= 20; i++) {
            if (i % 5 == 0 && i % 3 != 0) {
                System.out.println(i + " kelipatan 5");
            }
        }
        
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
       
                  System.out.println(i + " kelipatan 3dan5");
                  
            }
        }

	}
}
