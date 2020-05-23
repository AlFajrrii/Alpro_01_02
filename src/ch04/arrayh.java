public class arrayh {
     public static void main(String[] args){
        int[] array = {3,8,9,12,19,20,26,32,38,41,48,55,82};
        int jum = 0;
        for( int num : array) {
            jum = jum+num;
        }
        System.out.println("Jumlah dari array nya adalah : "+jum);
     }
  }