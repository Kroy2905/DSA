package LinkList.Problems;

import java.util.HashSet;
/**
 * Code to remove any duplicates 
 */

public class RemoveDuplicates {
    
   
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int ct =0;
         LinkListMain ll = new LinkListMain();
         ll.createMLinkList(10);
         ll.push(30);
         ll.push(30);
         ll.push(40);
         ll.push(50);
         ll.push(50);
         ll.traversalLL();
         HashSet hashSet = new HashSet<Integer>();
         MNode tmp = ll.head;
         MNode prev = ll.head;
         while(ct<ll.size-1){
            if(hashSet.contains(tmp.value)){  // if the element exists in the hashset
                prev.next=tmp.next;
                ll.size--;
              
            }else{
                hashSet.add(tmp.value);
                prev=tmp;
                tmp = tmp.next;
            
            }
            ct++;
         }

         ll.traversalLL();
         
    }

}
