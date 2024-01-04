package LinkList.CircularDoubleLinkList;

import LinkList.CirccularLinkedList.CNode;

public class CircularDoubleLinkedList {
    public CDNode head;
    public CDNode tail;
    public int size =0;

    public CDNode createCircularDoubleLinkedList(int nodeVal){
        CDNode node = new CDNode();
        node.value  = nodeVal;
        node.next = node;
        node.prev = node;
        head=node;
        tail=node;
        size++;
        return head;
    }

    	public void  push(int nodeVal, int loc){
		CDNode node =  new CDNode (); 
		node.value=nodeVal;
		if(head==null){
			createCircularDoubleLinkedList(nodeVal);
		}
		else if(loc == 0){   // inserting in the beginning 
			node.next=head;  // new node inserted before head
            node.prev=tail; 
			head.prev=node;      // head points to new node
            head = node; 
			tail.next = head; // creating the circular path 

		
		}
		else if(loc>=size){   // inserting at the end 
			node.next=head;
            node.prev=tail;
            head.prev=node;
			tail.next=node;
			tail=node;
		}
		else {				// inserting in the middle 
			int pos =0;
			CDNode prev =head;
			CDNode tmp = head;
			while(pos<size-1){
				pos++;
				if(pos==loc){  // changing the value 
					prev.next=node;
                    node.prev=prev;
					node.next=tmp;
                    tmp.prev = node;
					break;
				}else{
					prev=tmp;
					tmp=tmp.next;
				}
			}


		}
		size++;
	}

    public void  pop(int loc){


		if(head==null){
			System.out.println("No element to delete !!");
		}
		else if( size ==1){   // deleting if only 1 element present 
			head.prev = null;
            head.next=null;
            head = null;
			tail = null;
		}
		else if (loc==0){   //deleting from beginning 
            head = head.next;
            head.prev=tail;
            tail.next=head;
		
		}
		else if(loc>=size){  // deleting from end 
		  tail = tail.prev;
          tail.next = head;
          head.prev=tail;
		}
		else {			// deleting from middle in the middle 
			int pos =0;
			CDNode prev =head;
			CDNode tmp = head;
			while(pos<size){
				pos++;
				if(pos==loc){  // changing the value 
					prev.next=tmp.next;
                    tmp.next.prev=prev;
					break;
				}else{
					prev=tmp;
					tmp=tmp.next;
				}
			}


		}
		size--;
	}


	
}
