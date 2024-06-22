package Sorting;

public class Main {
    public static void main(String[] args) {
       // BubbleSort sort = new BubbleSort();
       // SelectionSort sort = new SelectionSort();
      //  InsertionSort sort = new InsertionSort();
     



        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        // BucketSort sort = new BucketSort(arr);
       // MergeSort sort = new MergeSort();
        // QuickSort sort = new QuickSort();
        HeapSort sort = new HeapSort(arr);

        sort.sort();
        
    }
}
