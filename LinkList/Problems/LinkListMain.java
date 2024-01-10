package LinkList.Problems;
/**
 * This is the main linklisrt class for 
 * solving the questions 
 */
public class LinkListMain {
    MNode head;
    MNode tail;
    int size=0;
    public void createMLinkList(int nodeval){
        MNode node = new MNode();
        node.value = nodeval;
        node.next=null;
        head=node;
        tail = node;
        size++;
    }

    public void push (int nodeval){
        if(head ==null){
            createMLinkList(nodeval);
        }else{
     MNode  node = new MNode();
        node.value = nodeval;
        node.next=null;
        tail.next=node;
        tail = node;
        size++;
        }
   

    }
   

    

    public void traversalLL(){
        MNode tmp = head;
        int ct = 0;
        while(ct<size){
            System.out.print(tmp.value+"-");
            ct++;
            tmp=tmp.next;
        }
        
         System.out.println();
    }
}
