package Queue;

import LinkList.SingleLinkList.Node;
/**
 * Implementing  queue using stack 
 * @param args
 */

public class QueueUsingStack {
    


    public class Stack {
         Node head=  null;
    Node tail =  null;
    int size = 0 ;

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
                return createLinkList(val);
            }
            Node node = new Node();
            node.value = val;
            node.next=null;
            tail.next=node;
            tail=node;
            size++;

        return head;
    }

     public Node pop (){
            if(head==null){
                System.out.println("Stack underflow!!");
                return head;
            }
            if(head == tail){
                Node result = tail;
                head = null;
                tail = null;
                return result;
            }
       
          Node tmp = head;
          Node prev = head;
          Node result = tail;
          while(tmp.next != null){
            prev = tmp;
            tmp = tmp.next;
          }
          tail.next = prev;
          prev.next = null;
          tail=prev;
          size--;




        return result;
    }

    public  boolean isEmpty(){
        if(head==null)
        return true;
        return false;
    }
    public Node  peek (){
        return tail;
    }
     public  void traverse(){
        Node tmp = head;
        
         
          while(tmp != null){
             System.out.print(tmp.value+"-");
           
            tmp = tmp.next;
          }
        
        System.out.println();
     }

    }
    public class Queue{
        QueueUsingStack  qus = new QueueUsingStack();
        QueueUsingStack.Stack stack1 = qus.new Stack();
        QueueUsingStack.Stack stack2 = qus.new Stack();

        public void push(int val){
            if(stack1.isEmpty() && stack2.isEmpty()){
                stack1.push(val);
            }else{
                stack1.push(val);
            stack1.traverse();
        }
    }
        public void pop(){
            if(stack1.isEmpty() && stack2.isEmpty()){
              System.out.println("underflow");
            }else {
                   // Node h = stack1.head;
                    while(stack1.head != stack1.tail){
                        stack2.push(stack1.pop().value);
                    } 
                    stack2.traverse();
                    stack1.pop();  // removing the element from the queue 
                    while(!stack2.isEmpty()){
                        stack1.push(stack2.pop().value);
                    } 
                    
            }
            stack1.traverse();
           
        }
    }

    public static void main(String[] args) {
        QueueUsingStack qus = new QueueUsingStack();
        QueueUsingStack.Queue queue = qus.new Queue();
        queue.push(2220);
        queue.push(11);
        queue.push(12);
        queue.push(13);
        queue.pop();
        queue.pop();
         queue.push(10);
        queue.push(11);
     
    }
}
