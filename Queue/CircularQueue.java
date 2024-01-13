package Queue;

public class CircularQueue {
    
    int arr[];
    int start = -1;
    int rear = -1 ;
    int ct=0;
    
     public CircularQueue(int size){
        arr = new int[size];
        rear =-1;
        start=0;
     }
     public void push (int val){
   
        
        if(ct==arr.length){
            System.out.println("Stack overflow!!");
        }else{
            ct++;
            rear++;
             if(rear>arr.length-1){
                rear=0;
            }
            arr[rear]=val;
           
            
        }
        
     }
      public void pop (){   // - O(1)
       // arr[rear]=0;
        
        if(ct==0){
            System.out.println("Stack underflow!!");
            
        }else{   // for(int i =0;i<rear;i++){  //  -- O(n)
            //     arr[i]=arr[i+1];
            // }
            //  rear--;
            // for(int i =0;i<rear;i++){  //  -- O(n)
            //     arr[i]=arr[i+1];
            // }
            //  rear--;
            arr[start]=404;
            start++;
            ct--;
            if(start>arr.length-1){
                start=0;
            }
        }
       
     }

       public int peek (){
        return arr[start];
     }

      public boolean isEmpty (){
        if(ct==0)
        return true;
        return false;
     }

     public void  traversall(){
        for(int i =0;i<=rear;i++){
            System.out.print(arr[i]+"-");
        }
        System.out.println();
     }
}
