package LinkList.Problems;

import java.util.Scanner;
/**
 * Code to print the value nth from last 
 */

public class Nth_To_Last {

     static LinkListMain ll = new LinkListMain();
    public static void main(String[] args) {

       
       
        ll.createMLinkList(10);
        ll.push(30);
        ll.push(30);
        ll.push(40);
        ll.push(50);
        ll.push(50);
        ll.traversalLL();
        NthFromLast();
        


    }

    public static void NthFromLastusingSize(){
         int ct =0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>ll.size || n<0){
            System.out.println("No element found !!");
        }else{
            MNode tmp = ll.head;
            while(ct<(ll.size-n)){
                tmp = tmp.next;
                ct++;
            }

            System.out.println(tmp.value);
        }
        
    }

        public static void NthFromLast(){
         int ct =0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if( n<0){
            System.out.println("No element found !!");
        }else{
            MNode p1 = ll.head;
            MNode p2 = ll.head;
            while(ct<n){
                p2= p2.next;
                if(p2==null){
                     break;
                }
                ct++;
            }
            while(p2!=null){
                p2 = p2.next;
                p1 = p1.next;
            }

            System.out.println(p1.value);
        }
        
    }
}
