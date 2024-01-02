package LinkList.DoubleLinkedList;

import LinkList.CirccularLinkedList.CNode;

public class DoubleLinkList {
    public DNode head;
	public DNode tail;
	public int size;

	public DNode createDoubleLinkedListnode(int nodeVal){ // Time Complexity = O(1)
		head = new DNode();
		DNode node = new DNode();
		node.value=nodeVal;
		node.next=null;
        node.prev=null;
		head = node;
		tail = node;
		size++;
		return head;
	}

    public void  push(int nodeVal, int loc){
		DNode node =  new DNode (); 
		node.value=nodeVal;
		if(head==null){
			createDoubleLinkedListnode(nodeVal);
		}
		else if(loc == 0){   // inserting in the beginning 
			node.next=head;  // new node inserted before head 
            node.prev=null;  // making 1st node prev null 
            head.prev=node;  // making the head's prev link to new , so head  points  2nd element 
            
			head=node;      // head points to new node which is the 1st element 
			

		
		}
		else if(loc>=size){   // inserting at the end 
			node.next=null;
            node.prev=tail;
			tail.next=node;
			tail=node;
		}
		else {				// inserting in the middle 
			int pos =0;
			DNode prev =head;
			DNode tmp = head;
			while(pos<size-1){
				pos++;
				if(pos==loc){  // changing the value 
					prev.next=node;
					node.next=tmp;
                    node.prev=prev;
                    tmp.prev=node;
                    
					break;
				}else{
					prev=tmp;
					tmp=tmp.next;
				}
			}


		}
		size++;
	}


}
