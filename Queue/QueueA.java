package Queue;

public class QueueA {
    

    int arr[];
    int start = 0;
    int topval = -1 ;
    
     public QueueA(int size){
        arr = new int[size];
        topval = -1;
        start=0;
     }
     public void push (int val){
        
        if(topval>=arr.length-1){
            System.out.println("Stack overflow!!");
        }else{
            topval++;
            arr[topval]=val;
            
        }
     }
      public void pop (){   // - O(1)
       // arr[topval]=0;
        
        if(topval<0){
            System.out.println("Stack underflow!!");
            
        }else{
            for(int i =0;i<topval;i++){
                arr[i]=arr[i+1];
            }
             topval--;
        }
       
     }

       public int peek (){
        return arr[0];
     }

      public boolean isEmpty (){
        if(topval==-1)
        return true;
        return false;
     }

     public void  traversall(){
        for(int i =0;i<=topval;i++){
            System.out.print(arr[i]+"-");
        }
        System.out.println();
     }
}
