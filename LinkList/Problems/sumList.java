package LinkList.Problems;
/**
 * Sum of 2 numbers stored in reverse order using link list 
 */
public class sumList {

    static LinkListMain ll1 = new LinkListMain();
    static LinkListMain ll2 = new LinkListMain();
        static LinkListMain ll3 = new LinkListMain();

    public static void main(String[] args) {
           
   
    ll1.createMLinkList(9);
   ll1.push(9);
   ll1.push(7);
   ll1.push(9);
  // ll1.push(9);
   ll2.createMLinkList(1);
    ll2.push(1);
     ll2.push(1);
     ll1.traversalLL();
     ll2.traversalLL();
     solution(ll1.head,ll2.head);
     ll3.traversalLL();
 
    }
    static void solution (MNode head1,MNode head2){
        int carry=0;
        while (head1!=null || head2 !=null){
            int res = carry;
            
                if(head1!=null){
                    res+=head1.value;
                    head1=head1.next;
                } 
                
                if (head2 != null){
                        res+=head2.value;
                        head2 = head2.next;
                }
                ll3.push(res%10);
                carry = res/10;
            }
            if(carry==1){
                ll3.push(1);
            }
    }
}
