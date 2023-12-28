package LinkList.SingleLinkList;

/* Name of the class has to be "Main" only if the class is public. */
public  class SingleLinkList
{
	public Node head;
	public Node tail;
	public int size;

	public Node createSingleLinkedListnode(int nodeVal){ // Time Complexity = O(1)
		head = new Node();
		Node node = new Node();
		node.value=nodeVal;
		node.next=null;
		head = node;
		tail = node;
		size++;
		return head;
	}

	public void  push(int nodeVal, int loc){
		Node node = new Node();
		node.value=nodeVal;
		if(head==null){
			createSingleLinkedListnode(nodeVal);
		}
		else if(loc == 0){   // inserting in the beginning 
			node.next=head;
			head=node;
		}
		else if(loc>=size){   // inserting at the end 
			node.next=null;
			tail.next=node;
			tail=node;
		}
		else {				// inserting in the middle 
			int pos =0;
			Node prev =head;
			Node tmp = head;
			while(tmp!=null){
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

			Node prev =head;
			Node tmp = head;
			while(tmp!=null){  // looping to get ythe 2nd last element 
				prev=tmp;
				tmp=tmp.next;			
			}

			prev.next=null;
			tail=prev;

		}
		else {			// deleting from middle in the middle 
			int pos =0;
			Node prev =head;
			Node tmp = head;
			while(tmp!=null){
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
