package Stack;

import LinkList.SingleLinkList.Node;

/**
 *  design a stack  in addition  to push and pop and have a function min 
 * such that it returns the min value in the stack at O(1), time  
 */
public class Min {
    public class Stack{
        int arr[];
        int min[];
        int topval = -1;
        int minIndex=-1;
        int minval= Integer.MAX_VALUE;
        
         public Stack(int size){
            arr = new int[size];
            min = new int[size];
            topval = -1;
         }
         public void push (int val){
            
            if(topval>=arr.length-1){
                System.out.println("Stack overflow!!");
               
            }else{
                if(val<minval){
                    minval=val;
                    minIndex++;
                    min[minIndex]=val;
                }else{
                    minIndex++;
                    min[minIndex]=minval;
                }
                topval++;
                arr[topval]=val;
            }
         }
          public void pop (){
            if(topval<0){
                System.out.println("Stack underflow!!");
               
            }else{
                min[minIndex]=Integer.MAX_VALUE;
                arr[topval]=-1;
                minIndex--;
                topval--;
            }
         }
    
           public int peek (){
            return arr[topval];
         }

         public void  min(){
            if(!isEmpty()){
                System.out.println(min[minIndex]);
            }
            else{
                System.out.println("No Element present !!");
            }
             
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

  public class  StackL{  // same logic using link list 
     Node head=  null;
    Node tail =  null;
    Node min =  null;

    int size = 0 ;
    int minval = Integer.MAX_VALUE;

    public Node createLinkList(int val){
        Node node = new Node();
        node.value=val;
        node.next=null;
        head=node;
        tail=node;
        size++;
        return head;
    }


    public Node push (int val){
            if(head==null){
                minval = Integer.MAX_VALUE;
               // if(val<minval){
                    Node tmp = new Node();
                    tmp.value=val;
                    tmp.next=null;
                    min=tmp;
                //}
                return createLinkList(val);
            }
            Node node = new Node();
            node.value = val;
            node.next=null;
            tail.next=node;
            tail=node;
            if(val<minval){
                minval=val;
                Node tmp = new Node();
                tmp.value=val;
                tmp.next=min;
                min=tmp;
            }else{
                Node tmp = new Node();
                tmp.value=minval;
                tmp.next=min;
                min=tmp;
            }
            size++;

        return head;
    }

     public Node pop (){
            if(head==null){
                System.out.println("Stack underflow!!");
                return head;
            }
            if(head == tail){
                min=min.next;
                head = null;
                tail = null;
                return head;
            }
       
          Node tmp = head;
          Node prev = head;
          min=min.next;
          while(tmp.next != null){
            prev = tmp;
            tmp = tmp.next;
          }
          tail.next = prev;
          prev.next = null;
          tail=prev;
          size--;




        return head;
    }

    public  boolean isEmpty(){
        if(head==null)
        return true;
        return false;
    }
    public Node  peek (){
        return tail;
    }
    public void min(){
        System.out.println(min.value);
    }
     public  void traverseall(){
        Node tmp = head;
        
         
          while(tmp != null){
             System.out.print(tmp.value+"-");
           
            tmp = tmp.next;
          }
        
        System.out.println();
     }

  }

    public static void main(String[] args) {
        Min m  = new Min();
        Min.StackL stack =  m.new StackL();
        stack.push(10);
        stack.traverseall();
        stack.min();
        stack.push(20);
        stack.push(6);
        stack.push(8);
        stack.push(18);
        stack.traverseall();
    stack.min();
    stack.pop();
    stack.pop();
    stack.pop();
    stack.traverseall();
    stack.min();
    }
}
