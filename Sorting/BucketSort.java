package Sorting;
import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {
    

    int arr[];
    public BucketSort(int[] arr) {
        this.arr = arr;
    }
    void printArray() {
        int n = arr.length;
        for (int i = 0; i<n; i++) {
          System.out.print(arr[i] + " ");
        }
        System.out.println();
      }
      public void printBucket(ArrayList<Integer> [] buckets) {
        for(int i = 0; i<buckets.length; i++) {
            System.out.print("Bucket "+i+": ");
            for(int j = 0; j<buckets[i].size(); j++) {
                System.out.print(buckets[i].get(j)+" ");
            }
            System.out.println();
  
      }
    }
      public void bucketSort(){
        int numberOfBuckets = (int)Math.ceil(Math.sqrt(arr.length)); // getting number of buckets
        int maxVal = Integer.MIN_VALUE;
        for(int value :arr){   // getting max value
            maxVal = Math.max(maxVal,value);
        } 
        ArrayList<Integer> [] buckets = new ArrayList[numberOfBuckets];
        for(int i = 0; i<numberOfBuckets; i++) {  // initializing buckets
            buckets[i] = new ArrayList<Integer>();
        }
        for(int value :arr) { // adding  elements to respective buckets 
            int bucketIndex = (int)Math.ceil((float)value *numberOfBuckets/(float)maxVal);
            buckets[bucketIndex-1].add(value);
        };
        System.out.println("Buckets before sorting");
        printBucket(buckets);
        for(ArrayList<Integer> bucket : buckets) {
            Collections.sort(bucket);
        }
        System.out.println("Buckets after  sorting");
        printBucket(buckets);
        int index =0;
        //Concatenating all the buckets
        for(ArrayList<Integer> bucket : buckets) {
            for(int i = 0; i<bucket.size(); i++) {
                arr[index++] = bucket.get(i);
            }
        }


      }

}
