import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//soal 1
		System.out.print("nyawa awal pemain :");
		 int nyawaAwal = input.nextInt();
		 int nyawasetelahnaiklevel= nyawaAwal++;
		 int nyawasetelahkenajebakan=nyawasetelahnaiklevel--;
		 System.out.println(" jumlah nyawa terakhir : "+nyawasetelahkenajebakan);
		 
		 //soal2
		 
		 System.out.print("saldo awal :");
		 int saldoawal =input.nextInt();
		 System.out.print("Uang ditabung :");
		 int uangditabung =input.nextInt();
		 System.out.print("Uang diambil :");
		 int uangdiambil=input.nextInt();
		 saldoawal+=uangditabung;
		 saldoawal-=uangdiambil;
		 System.out.println("saldo akhir :"+saldoawal);
		  
		  // soal 3
      
    

        System.out.print("kode sistem: ");
        String kodeSistem = input.next();
        System.out.print("kode input :");
        String kodeUser =input.next();

        boolean loginBerhasil = kodeSistem== kodeUser;
        boolean loginGagal = kodeSistem !=kodeUser;
        System.out.println(loginBerhasil);
        System.out.println(loginGagal);
      
    

          //soal 4
        System.out.print("umur peserta : ");
        int umur = input.nextInt();

        boolean bolehIkut = umur > 17;
        System.out.println(bolehIkut);
        //soal 5
        System.out.print("nilai ujian :");
        int nilai = input.nextInt();
        boolean lulus = nilai >=75;
        System.out.println(lulus);
        //soal 6
        System.out.print("nilai siswa :");
        int nilaii= input.nextInt();
        System.out.print("kehadiran siswa :");
        int kehadiran = input.nextInt();
        boolean kelayakan =nilaii>=85&&kehadiran>=90;
        System.out.println(kelayakan);
        //soal 7

        System.out.print("status kartu : ");
        boolean statuskartu= input.nextBoolean();

        System.out.print("jumlah barang : ");
        int jumlahBarang = input.nextInt();

        boolean dapatDiskon =statuskartu || jumlahBarang > 3;
        System.out.println(dapatDiskon);
         //soal 8 
        

        System.out.print("status hari libur :");
        boolean hariLibur =input.nextBoolean();

        boolean harusBekerja = !hariLibur;
        System.out.println(harusBekerja);
        
    

        
    }
}
    

	
