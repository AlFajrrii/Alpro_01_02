import java.util.Scanner;

public class bubblesort {
	public static void main(String[]args){
		int jumlah,i,j, swap;
		Scanner scan = new Scanner(System.in);
 
		System.out.print(" Masukkan Jumlah Bilangan array nya = ");
		jumlah = scan.nextInt();
 
		int array[] = new int[jumlah];
  
		System.out.println("\nMasukkan " + jumlah+" Buah Bilangan array nya ");
		for(i=0; i<jumlah;i++)
		{
		System.out.print("Bilangan Ke- " + (i+1)+" =");
		array[i]=scan.nextInt();
		}

		System.out.println("\nBilangan awal");
		for(int a=0;a<jumlah;a++)
		{
		System.out.print(array[a] +" ");
		}

		for(i=0; i<(jumlah-1);i++)
		{
		for(j=0;j<jumlah-i-1;j++)
		{
		if (array[j] > array[j+1])
		{
		swap = array[j];
		array[j] = array[j+1];
		array[j+1]=swap;
    }
   }
  }

	System.out.println("\n\nHasil bilangannya :");
	for(i=0;i<jumlah; i++)
	System.out.print(array[i] +" ");
 }
}