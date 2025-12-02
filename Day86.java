public class Main {
	public static void main(String[] args) {
		int []a= {1,7,4,5,10};
		int minimal=a[0];
		for(int i = 0; i < a.length;i++){
			if(a[i]<minimal){
				minimal=a[i];
		}
	}
	
System.out.println(minimal);
}
}
