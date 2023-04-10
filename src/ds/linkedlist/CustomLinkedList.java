package ds.linkedlist;

public class CustomLinkedList {

	Node head;
	Node tail;

	public void add(int data) {

		Node newnode = new Node(data);

		if (head == null) {
			head = newnode;
			tail = newnode;

		} else {
			tail.next = newnode;
			tail = newnode;
		}
	}

	public void print() {
		Node curNode = head;
		while (curNode != null) {
			System.out.println(curNode.data);

			curNode = curNode.next;

		}
	}

	public void findNthNode(int index) {
		int i = 1;

		Node curNode = head;
		while (i != index) {
			curNode = curNode.next;
			i++;
		}

		System.out.println("Current Node DATA " + curNode.data);

	}

	public void searchElement(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;

	}

	public boolean search(Node head, int x) {
		Node current = head;
		while (current != null) {
			if (current.data == x)
				return true;
			current = current.next;

		}

		return false;

	}

}
