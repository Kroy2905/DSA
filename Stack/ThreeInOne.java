package Stack;


/**
 * have  3 stacks in 1 array 
 * @param args
 */
public class ThreeInOne {

    public class Stack{
         int[]arr;
      int stackNumber=0;
         int no_of_stack=3;
         int stack_size=0;
     int [] stack_size_ct = {-1,-1,-1};  // holding the no. of elements of each stack
        Stack(int stack_size){
            arr= new int[stack_size*3];
            this.stack_size=stack_size;
        }

        public boolean isEmpty(int stackno){
           if(stack_size_ct[stackno-1]<0)
            return true;
            return false;
           
        }

        public  boolean isFull(int stackno){
            if(stack_size_ct[stackno-1]==stack_size-1)
             return true;
             return false;
            
         }
        public  void  push(int val,int stackno){
            switch(stackno){
                case 1 :
                if(!isFull(stackno)){
                    stack_size_ct[stackno-1]++;
                    int index = stack_size_ct[stackno-1];
                    arr[index]=val;
                       

                }else{
                    System.out.println("Stack Overflow!!");
                }
                break;

                case 2 :
                if(!isFull(stackno)){
                    stack_size_ct[stackno-1]++;
                    int index =((arr.length/3) + stack_size_ct[stackno-1]);
                    arr[index]=val;
                       

                }else{
                    System.out.println("Stack Overflow!!");
                }
                break;

                case 3 :
                if(!isFull(stackno)){
                    stack_size_ct[stackno-1]++;
                    int index =(((2*arr.length)/3) + stack_size_ct[stackno-1]);
                    arr[index]=val;
                      
                }else{
                    System.out.println("Stack Overflow!!");
                }
                break;

            }
        }
        public   void pop(int stackno){
            switch(stackno){
                case 1 : 
                if(!isEmpty(stackno)){
                    int index = stack_size_ct[stackno-1];
                    arr[index]=-1;
                    stack_size_ct[stackno-1]--;
                    
                    
                }else{
                    System.out.println("Stack Underflow!!");
                }
                break;

                case 2 :
                if(!isEmpty(stackno)){
                    int index =((arr.length/3) + stack_size_ct[stackno-1]);
                    arr[index]=-1;
                    stack_size_ct[stackno-1]--;
                    
                   
                       

                }else{
                    System.out.println("Stack Underflow!!");
                }
                break;

                case 3 :
                if(!isEmpty(stackno)){
                    int index =(((2*arr.length)/3) + stack_size_ct[stackno-1]);
                    arr[index]=-1;
                    stack_size_ct[stackno-1]--;
                   
                      
                }else{
                    System.out.println("Stack Underflow!!");
                }
                break;
                
            }
        }
        public void traverse(){
            for(int i =0;i<arr.length;i++){
                System.out.print(arr[i]+"-");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        ThreeInOne threeInOne = new ThreeInOne();
        ThreeInOne.Stack stack = threeInOne.new Stack(4);
        stack.push(1, 1);
        stack.push(2, 2);
        stack.push(3, 3);
        stack.push(1, 1);
        stack.push(2, 2);
        stack.push(3, 3);
        stack.push(1, 1);
        stack.push(2, 2);
        stack.push(3, 3);
        stack.push(1, 1);
        stack.push(2, 2);
        stack.push(3, 3);
        stack.push(1, 1);
        stack.push(2, 2);
        stack.push(3, 3);
        stack.traverse();
        stack.pop(1);
        stack.pop(2);
        stack.pop(3);
        stack.traverse();
    }
}
