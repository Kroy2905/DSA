package LinkList;


import LinkList.CirccularLinkedList.CNode;
import LinkList.CirccularLinkedList.CircularLinkList;
import LinkList.DoubleLinkedList.DNode;
import LinkList.DoubleLinkedList.DoubleLinkList;
import LinkList.SingleLinkList.Node;
import LinkList.SingleLinkList.SingleLinkList;


public class LinkList {
    public static void main (String[] args) throws java.lang.Exception
	{
	 SingleLinkList sll = new SingleLinkList();
     CircularLinkList cll = new CircularLinkList();
     DoubleLinkList dll = new DoubleLinkList();
     LinkList ll = new LinkList();
//         sll.createSingleLinkedListnode(10);
//     ll.displaySingleLinkList(sll.size,sll.head);
//         sll.push(30, 2);
//          sll.push(40, 3);
//           sll.push(50, 4);
//            sll.push(80, 4);
//             sll.push(90, 2);
//              sll.push(100, 4);
            
//            sll.push(70, 2);
//   ll.displaySingleLinkList(sll.size,sll.head);


        // sll.pop(0);
        //     ll.displayLinkList(sll.head);
        //     sll.pop(4);
        //     ll.displayLinkList(sll.head);
        //       sll.pop(2);
        //        ll.displayLinkList(sll.head);

        // **************************************XXXXXXXXXXXX************************************************************

          // Circular linked List Section 

//          cll.createCircularLinkedListnode(10);
     
//          cll.push(30, 0);

//          cll.push(40, 3);
//           cll.push(50, 4);
//            cll.push(80, 5);
//             cll.push(90, 6);
//              cll.push(100, 4);


//   ll.displayCircularLinkList(cll.size,cll.head);

//         cll.pop(0);
         
//            cll.pop(6);
            
//               cll.pop(2);
               
        

//          ll.displayCircularLinkList(cll.size,cll.head);
    

//    Double Link List Section  
            dll.createDoubleLinkedListnode(10);
           // ll.displayDoubleLinkList(dll.size,dll.head);

                   
     
         dll.push(30, 0);

         dll.push(40, 3);
          dll.push(50, 4);
           dll.push(80, 5);
            dll.push(90, 6);
             dll.push(100, 4);


              ll.displayDoubleLinkList(dll.size,dll.tail);
   
        



        
	}


    public void displaySingleLinkList(int size ,Node start){

         int ct = 0;
            while(start.next!=null){
             System.out.print(start.value+"-");
          
            start=start.next;
            ct++;
            
        }
        System.out.println();

    }
   
    public void  displayCircularLinkList(int size,CNode start){
        CNode tmp = start ;
        int ct = 0;
         
       
        while(ct<size){
             System.out.print(start.value+"-");
          
            start=start.next;
            ct++;
            
        }
        System.out.println();
    }

    public void  displayDoubleLinkList(int size,DNode start){
      
        int ct = 0;
         
       
        while(ct<size){
             System.out.print(start.value+"-");
          
            start=start.prev;
            ct++;
            
        }
        System.out.println();
    }
}
