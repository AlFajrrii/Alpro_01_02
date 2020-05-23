import java.util.Scanner;
public class nilaitertinggi2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan nilai X = ");
        int X = input.nextInt();
        System.out.print("masukkan nilai Y = ");
        int Y = input.nextInt();
		System.out.print("masukkan nilai Z = ");
        int Z = input.nextInt(); 
        
        if(X>Y && X>Z){
            System.out.println(" X adalah nilai tertinggi");
        }else if (Y>X && Y>Z){
            System.out.println(" Y adalah nilai tertinggi");       
        }else{
            System.out.println(" Z adalah nilai tertinggi");
        }
    }
}
