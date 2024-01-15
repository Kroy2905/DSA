package Queue;

import java.util.Scanner;

import LinkList.SingleLinkList.Node;
/**
 * There are dogs and cats in a queue , depending on a query , 
 * either any of the animal can be removed 
 * oldest[1st most cat in the queue ]  needs to be removed  - cats represented by 0 
 * oldest [1st most dog in the queue] needs to be removed   - dogs represented by 1 
 * 
 * commands - 
 * 1 - remove any animal 
 * 2 - remove cat 
 * 3 - remove dog 
 */

public class CatsAndDogs {

    public  class Queue{
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

    public void pop(){  // dequeue Any 
      
        if(size<=0){
            System.out.println("Queue underflow !!");
        }else{
            head= head.next;
            size--;
        }
    }

        public void removeAnimal(int animalCode){
            Node tmp = head;
            Node prev = head;
            boolean animalExists =false ;
        
         
            while(tmp != null){
             if(tmp.value==animalCode){
                animalExists=true;
                break;
             }
             prev=tmp;
             
              tmp = tmp.next;
            }

            if(tmp==head  && animalExists)
            pop();
            else if(tmp == tail  && animalExists){
                prev.next=null;
                tail= prev;
            }
            else if(animalExists){
                prev.next=tmp.next;
                tmp.next=null;
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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        CatsAndDogs cad = new CatsAndDogs();
        CatsAndDogs.Queue queue = cad.new Queue();
        queue.push(0);
        queue.push(1);
        queue.push(1);
        queue.push(0);
        queue.push(1);
        queue.push(0);
        queue.push(0);
        queue.push(1);
        queue.traversall();
        while(q-- >=0 ){
            int x = sc.nextInt();
            switch(x){
                case 1:
                queue.pop();
                queue.traversall();
                break;

                case 2:
                queue.removeAnimal(0);
                queue.traversall();
                break;
                case 3:
                queue.removeAnimal(1);
                queue.traversall();
                break;


            }
        }
        

    }
}
