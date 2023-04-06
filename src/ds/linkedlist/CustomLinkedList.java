package ds.linkedlist;

public class CustomLinkedList {
	
	Node head;
	Node tail;
	
	
	public void add(int data) {
		
		Node newnode = new Node(data);
		
		if(head == null) {
			head = newnode;
			tail = newnode;
			
		}else {
			tail.next = newnode;
			tail = newnode;
		}
	}

}
