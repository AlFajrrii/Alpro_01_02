import java.util.Scanner;
public class nilaitertinggi {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan nilai X = ");
        int X = input.nextInt();
        System.out.print("masukkan nilai Y = ");
        int Y = input.nextInt();    
        
        if(X>Y){
            System.out.println("   X adalah nilai tertinggi ");
        
        }else {
            System.out.println("   Y adalah nilai tertinggi ");
        }
    }
}
