package shakersort;
import java.util.Random;
/**
 *
 * @author Taeyeon
 */
public class main {

    private int[] data;
    
    private static Random valueGen = new Random();
    
    public void setData(int newSize)
    {
        data = new int[newSize];
        for (int i=0; i<newSize; i++)
        {
            data[i]=1+ valueGen.nextInt(120);
        }
    }
    
    public int [] getData()
    {
        return data;
    }
    
    public void testData()
    {   
        for(int i=0; i<data.length; i++)
        {
            System.out.print(data[i]+" ");
        }
    }
        
    public void shakerSort(int [] newData)
    {
        int [] toSort = newData;
        for (int i=0; i<toSort.length/2; i++)
        {
            boolean swapped = false;
            for(int j=0; j<toSort.length - i -1; j++)
            {
                int temp;
                if(toSort[j]> toSort[j+1])
                {
                    temp = toSort[j];
                    toSort[j] = toSort[j+1];
                    toSort[j+1]= temp;
                    swapped = true;
                }
            }
            
           for(int k=toSort.length-2-i; k>i; k--)
            {   
                int temp;
                if(toSort[k]< toSort[k-1])
                {
                    temp = toSort[k];
                    toSort[k] = toSort[k-1];
                    toSort[k-1]= temp;
                    swapped = true;
                }
            }
            
            if(!swapped)
            break;
        }
    }
}