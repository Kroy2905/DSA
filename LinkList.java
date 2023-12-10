public class LinkList {
    public static void main (String[] args) throws java.lang.Exception
	{
	 SingleLinkList sll = new SingleLinkList();
     LinkList ll = new LinkList();
        sll.createSingleLinkedListnode(10);
        ll.displayLinkList(sll.head);
        sll.push(30, 2);
         sll.push(40, 3);
          sll.push(50, 4);
           sll.push(80, 4);
            sll.push(90, 4);
             sll.push(100, 4);
            
           sll.push(70, 2);
        ll.displayLinkList(sll.head);


        sll.pop(0);
            ll.displayLinkList(sll.head);
            sll.pop(4);
            ll.displayLinkList(sll.head);
              sll.pop(2);
               ll.displayLinkList(sll.head);

        
	}
    public void  displayLinkList(Node start){
        while(start!=null){
            System.out.print(start.value+"-");
            start=start.next;
        }
        System.out.println();
    }
}
