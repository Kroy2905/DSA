package Queue;

import LinkList.SingleLinkList.Node;

public class QueueL {
    Node head =null;
    Node tail = null;
    int size =0;

    public Node createQueue(int val){
     Node node = new Node();
     node.value = val;
     node.next=null;
     head = node;
     tail = node;
     size++;
        return head;
    }

    public void push(int val){
            if(head == null){
                createQueue(val);
            }else{
                Node n = new Node();
                n.value=val;
                n.next= null;
                tail.next=n;
                tail=n;
                  size++;
            }
          
    }

    public void pop(){
         System.out.println(size);
        if(size<=0){
            System.out.println("Queue underflow !!");
        }else{
            head= head.next;
            size--;
        }
    
        
    }


    public  boolean isEmpty(){
        if(head==null)
        return true;
        return false;
    }
    public Node  peek (){
        return head;
    }
     public  void traversall(){
        Node tmp = head;
        
         
          while(tmp != null){
             System.out.print(tmp.value+"-");
           
            tmp = tmp.next;
          }
        
        System.out.println();
     }

}
