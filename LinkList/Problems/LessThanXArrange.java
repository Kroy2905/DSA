package LinkList.Problems;

import java.util.Scanner;

/**
 * Code to arrange link list in such a way such that  all numbers below x are 
 * in fron of all numbers above x 
 */
public class LessThanXArrange {

    static LinkListMain ll = new LinkListMain();
    public static void main(String[] args) {
      
    ll.createMLinkList(10);
     ll.push(40);
    ll.push(30);
    ll.push(50);
    ll.push(30);
     ll.push(2);
      ll.push(80);
       ll.push(70);
   
    
    ll.push(50);
    ll.traversalLL();
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    solution(ll.head,x);
    ll.traversalLL();
    
    }

    public static void solution(MNode start, int x ){
        MNode tmp = start;
        ll.tail=ll.head;
        while(tmp!=null){
            MNode next = tmp.next;
            if(tmp.value<=x){  // if less thna or equal to x  add in the front 
                MNode t = tmp;
                t.next = ll.head;
                ll.head= t;
            
            }else{  // add in the last if greater than x
                ll.tail.next = tmp;
                ll.tail=tmp;           
             }
            tmp = next;
        }

            ll.tail.next=null;

          
    }
  
}
