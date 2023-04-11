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

	public boolean search(int x) {
		Node current = head;
		while (current != null) {
			if (current.data == x) {
				return true;
			}
			current = current.next;

		}

		return false;

	}

	public int getCount() {
		Node temp = head;
		int count = 0;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}

}
