package Sorting;
import Heap.Heap;
public class HeapSort {
    int arr[] = null ;

    HeapSort(int arr[]){
        this.arr = arr;
    }
    public void sort(){
        Heap heap = new Heap(arr.length);
        for(int i = 0; i < arr.length; i++){
            heap.insert(arr[i], "Min");
        }
        for(int i = 0; i < arr.length; i++){
           arr[i] =  heap.extractHeadofHeap("Min");
        }
        printArray(arr);
    }
    


    public static void printArray(int []array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"  ");
        }
        System.out.println();
    }
}
