package Heap;

public class Heap {
    int arr[];
    int sizeofTree;
    public Heap (int size){  // Time = O(1) , Space = O(n)
        arr= new int[size+1];
        this.sizeofTree = 0;
        System.out.println("Heap created !!");
    }
    public Integer peek(){  //Time - O(1) , Space O(1)
        if(isEmpty()){
            System.out.println("heap is empty!!");
            return null;
        }else{
            return arr[1];
        }
    }

    public boolean isEmpty(){
        if(sizeofTree==0)
        return true;
        return false;
    }
    public  int size(){
         return sizeofTree;
    }

    void preOrder(int index){
        if(index>sizeofTree){
            return;
        }
        System.out.println(arr[index]);
        preOrder(2*index);
        preOrder(2*index+1);
    }
    void inOrder(int index){
        if(index>sizeofTree){
            return;
        }
        inOrder(2*index);    
        System.out.println(arr[index]);     
        inOrder(2*index+1);
    }

    void postOrder(int index){  // T(n) = O(n) , S(n)= O(n)
        if(index>sizeofTree){
            return;
        }
        postOrder(2*index);
        postOrder(2*index+1);
        System.out.println(arr[index]);   
    }
    void levelOrder(){  // T(n) = O(n) , S(n)= O(n)
       for(int i =1;i<=sizeofTree;i++){
        System.out.print(arr[i] + " - ");
       }
       System.out.println("------------------------------");
       
    }

    public void heapifyBottomToTop(int index , String heapType){ //TIme - O(logn)  , S- O(logn)
        int parent = index/2;
        if(index ==  1){
            return;
        }
        if(heapType == "Min"){
            if(arr[index]<arr[parent]){
                int temp = arr[parent];
                arr[parent] = arr[index];
                arr[index] = temp;
            }
        }else if(heapType == "Max"){
            if(arr[index]>arr[parent]){
                int temp = arr[parent];
                arr[parent] = arr[index];
                arr[index] = temp;
            }
        }
        heapifyBottomToTop(parent, heapType);

    }
    public void insert(int value, String typeHeap){
        arr[sizeofTree+1] = value;
        sizeofTree++;
        heapifyBottomToTop(sizeofTree, typeHeap);
       // System.out.println();
    }

    public void heapifyToptoBottom(int index , String  heapType){
        int left= 2*index;
        int right = 2 * index +1;
        int swapchild =1;
        if(sizeofTree < left) // no more nodes present 
        return;
        if(heapType == "Min"){
            
            if(sizeofTree == left) {  // only 1 child present 
                if(arr[index]>arr[left]){
                    int temp = arr[index];
                    arr[index] = arr[left];
                    arr[left] = temp;
                }
                return;
    
               }else{
                  // select the larger child of the two child 
                  if(arr[left]<arr[right]){
                    swapchild = left;
                  }else{
                    swapchild = right;
                  }
                  if(arr[index]>arr[swapchild]){
                    int temp = arr[index];
                    arr[index] = arr[swapchild];
                    arr[swapchild] = temp;
                  }
               }
            
        }else if(heapType == "Max"){
           if(sizeofTree == left) {  // only 1 child present 
            if(arr[index]<arr[left]){
                int temp = arr[index];
                arr[index] = arr[left];
                arr[left] = temp;
            }
            return;

           }else{
              // select the larger child of the two child 
              if(arr[left]>arr[right]){
                swapchild = left;
              }else{
                swapchild = right;
              }
              if(arr[index]<arr[swapchild]){
                int temp = arr[index];
                arr[index] = arr[swapchild];
                arr[swapchild] = temp;
              }
           }
        }
        heapifyToptoBottom(swapchild, heapType);
    }

    public int extractHeadofHeap(String heapType){ // O (log n)
        if(isEmpty())
        return -1;
        else{
            int extractedValue = arr[1];
            arr[1] = arr[sizeofTree];
            sizeofTree--;
            heapifyToptoBottom(1, heapType);
            return extractedValue;
        }
    }
}
