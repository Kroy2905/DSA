package LinkList.Stack;

import LinkList.SingleLinkList.Node;
/**
 * Stack implementation using link list 
 */

public class StackL {
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
                head = null;
                tail = null;
                return head;
            }
       
          Node tmp = head;
          Node prev = head;
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
     public  void traverse(){
        Node tmp = head;
        
         
          while(tmp != null){
             System.out.print(tmp.value+"-");
           
            tmp = tmp.next;
          }
        
        System.out.println();
     }




}
