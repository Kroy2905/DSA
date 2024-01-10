package LinkList.Problems;

    /*
     * Find the interstion of two link list , by reference not the value , 
     * return null if not intersecting linklists 
     *  1 - 2 -3 --> 8-9-10
     *    4-5-6-7 --^
     */
public class Intersection {

    static LinkListMain ll1 = new LinkListMain();
    static LinkListMain ll2 = new LinkListMain();
        static LinkListMain ll3 = new LinkListMain();

    public static void main(String[] args) {
        ll1.createMLinkList(9);
   ll1.push(9);
 //  ll1.push(7);
   ll1.push(9);
  // ll1.push(9);
   ll2.createMLinkList(1);
    ll2.push(1);
   // pushCommonNode(ll1,ll2,88);
    // pushCommonNode(ll1,ll2,33);
    //  pushCommonNode(ll1,ll2,44);
     // ll1.push(21);
    
    // ll2.push(1);
     ll1.traversalLL();
     ll2.traversalLL();
     int ans = solution();
     if(ans!=0){
        System.out.println("Intersection point = "+ans);
    }else{
            System.out.println("No Intersection point!!");
    }
    }

    static int  solution (){
        /**
         * Preprocessing to make  both  the lists equal ; 
         * 
         */
        if(ll1.head==null || ll2.head==null) return 0;
        if(ll1.tail != ll2.tail) return 0 ;
        if ( ll1.size > ll2.size){
             for(int i =0;i<(ll1.size-ll2.size) && ll1.head!=null;i++){
                ll1.head = ll1.head.next;
             }
            }
             else if (ll2.size>ll1.size){
                for(int i =0;i<(ll2.size-ll1.size) && ll2.head!=null;i++){
                ll2.head = ll2.head.next;
             }
            }
            // ll1.traversalLL();
             //ll2.traversalLL();

             MNode t1 = ll1.head;
             MNode t2 = ll2.head;
             while(t1!=null || t2!=null){
                    if(t1 == t2){
                        return t1.value;
                    }
                    t1=t1.next;
                    t2=t2.next;
             }

            
        
        return 0;
    }

    private static void pushCommonNode (LinkListMain ll1 , LinkListMain ll2,int nodeval){

        MNode  node = new MNode();
           node.value = nodeval;
           node.next=null;
           ll1.tail.next=node;
            ll2.tail.next=node;
           ll1.tail = node;
           ll2.tail =node;
           ll1.size++;
           ll2.size++;
           }
      
}
