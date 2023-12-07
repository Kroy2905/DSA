
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
}
