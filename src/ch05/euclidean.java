import javax.swing.JOptionPane;

public class euclidean {
    public static void main(String[] args){                
        int d=0;
        int i =1;        
        int a= Integer.parseInt(JOptionPane.showInputDialog(" silahkan masukkan bilangan petama = "));
        int b= Integer.parseInt(JOptionPane.showInputDialog(" silahkan Masukkan Bilangan Kedua = "));
        
        int min = Math.min(a, b);
        while(i<=min){
            if ((a%i==0)&(b%i==0)){
                d=i;       
            }
            i++;
        }
        JOptionPane.showMessageDialog(null, "FPB dari "+a+" & "+b+" = "+d);
    }
}