import java.util.*;

public class Asn03G37P02 {

    public void sort(int array[]) {
        
    	int size = array.length;
        
        for (int i = size / 2 - 1; i >= 0; i--)
            heap(array, size, i);
        
        for (int i=size-1; i>=0; i--) {
            int x = array[0];
            array[0] = array[i];
            array[i] = x;
            heap(array, i, 0);
        }
    }
    void heap(int array[], int Heap_Size, int i) {
        
    	int smallest = i;         
    	int left  = 2*i + 1;         
    	int right  = 2*i + 2;
    	
    	if (left  < Heap_Size && array[left ] < array[smallest])
            		smallest = left ;       
    	
    	if (right  < Heap_Size && array[right ] < array[smallest])
    		smallest = right ;
        
    	if (smallest != i) {          
        	int swap = array[i];
            array[i] = array[smallest];
            array[smallest] = swap;
            heap(array, Heap_Size, smallest);
        }
    }

    public static void main (String [] args)
    {
        int arrA[] = {2,10,3,1,4,8,5,6,11,9};

        System.out.println("Array is: " + Arrays.toString(arrA));
        Asn03G37P02 heapSort = new Asn03G37P02();
        heapSort.sort(arrA);

        System.out.println("Sorted array is: " + Arrays.toString(arrA));
    }
}
