package LinkList.CirccularLinkedList;

public class CircularLinkList {
    public CNode head;
	public CNode tail;
	public int size;

	public CNode createCircularLinkedListnode(int nodeVal){ // Time Complexity = O(1)
		head = new CNode();
		CNode node = new CNode();
		node.value=nodeVal;
		node.next=node;
        
		head = node;
		tail = node;
		size++;
		return head;
	}

	public void  push(int nodeVal, int loc){
		CNode node =  new CNode (); 
		node.value=nodeVal;
		if(head==null){
			createCircularLinkedListnode(nodeVal);
		}
		else if(loc == 0){   // inserting in the beginning 
			node.next=head;  // new node inserted before head 
			head=node;      // head points to new node 
			tail.next = head; // creating the circular path 

		
		}
		else if(loc>=size){   // inserting at the end 
			node.next=head;
			tail.next=node;
			tail=node;
		}
		else {				// inserting in the middle 
			int pos =0;
			CNode prev =head;
			CNode tmp = head;
			while(pos<size-1){
				pos++;
				if(pos==loc){  // changing the value 
					prev.next=node;
					node.next=tmp;
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
			head = null;
			tail = null;
		}
		else if (loc==0){   //deleting from beginning 
			head = head.next;
		}
		else if(loc>=size){  // deleting from end 
			int ct=0;

			CNode prev =head;
			CNode tmp = head;
			while(ct<size-1){  // looping to get ythe 2nd last element 
				prev=tmp;
				tmp=tmp.next;	
				ct++	;	
			}

			prev.next=head;
			tail=prev;

		}
		else {			// deleting from middle in the middle 
			int pos =0;
			CNode prev =head;
			CNode tmp = head;
			while(pos<size){
				pos++;
				if(pos==loc){  // changing the value 
					prev.next=tmp.next;
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
