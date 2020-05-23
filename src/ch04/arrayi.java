public class Brainly {

   public static void main(String[] args) {

       // Nilai - Array Integer

       int nilai[] = {1 , 2 , 8 , 3};

       // Memanggil fungsi selisih()

       selisih(nilai);

   }

   static void selisih(int nilai[]) {

       int nilai_max = nilai[0]; // Untuk menampung nilai maksimal

       int nilai_min = nilai[0]; // Untuk menampung nilai minimal


       for(int i = 0; i < nilai.length; i++) {

           // Mencari nilai terkecil

           if(nilai[i] < nilai_min)

               nilai_min = nilai[i];

           

           // Mencari nilai terbesar

           if(nilai[i] > nilai_max)

               nilai_max = nilai[i];

       }

       // Menghitung selisih

       int selisih = nilai_max - nilai_min;

       System.out.println("Selisih nilai = " + selisih);

   }

}