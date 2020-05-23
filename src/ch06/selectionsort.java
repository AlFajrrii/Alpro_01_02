public class selectionsort {
    public static void main(String[] args) {
	
        int[] tabInt = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        int w,x,N;
        N=13;
        
        for (w = 0; w < N; w++) {
              int min = tabInt[w];
              int pos = w;
              for (x = w; x < N; x++) {
                   if (tabInt[x] < min) {
                   min = tabInt[x];
                   pos = x;
                }
              }
              if(w!=pos) {
                 int temp = tabInt[w];
                 tabInt[w] = tabInt[pos];
                 tabInt[pos] = temp;
               }
            }
        for(w=0; w<13; w++){ 
            System.out.print(tabInt[w]+" ");
        }
    }
}