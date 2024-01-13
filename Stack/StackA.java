package Stack;
/**
 * implementation of stack using array
 */
public class StackA {
    int arr[];
    int topval = -1;
    
     public StackA(int size){
        arr = new int[size];
        topval = -1;
     }
     public void push (int val){
        
        if(topval>=arr.length-1){
            System.out.println("Stack overflow!!");
           
        }else{
            topval++;
            arr[topval]=val;
        }
     }
      public void pop (){
        if(topval<0){
            System.out.println("Stack underflow!!");
           
        }else{
            arr[topval]=-1;
            topval--;
        }
     }

       public int peek (){
        return arr[topval];
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
