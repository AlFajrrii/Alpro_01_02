public class array3 {
    public static void main(String[] args) {
        int [] bil = {3,8,9,12,19,20,26,32,38,41,48,55,82};
		
        System.out.println("");
        System.out.print("Bilangan Ganjil :  ");
        for (int i = 0; i < bil.length; i++){
            if (bil [i] % 2!= 0){
                System.out.print(bil[i] + " ");
            }
        }      
        System.out.println("");
    }
}