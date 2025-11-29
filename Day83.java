public class main{
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int jumlah = 0;

        
        for (int i = 0; i < array.length; i++) {
            jumlah += array[i];
        }

        
        System.out.println("Jumlah elemen array: " + jumlah);
    }
}
