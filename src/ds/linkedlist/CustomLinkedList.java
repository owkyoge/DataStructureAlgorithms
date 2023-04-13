package ds.linkedlist;

import java.util.Stack;

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

	public void reverse() {
		Node curNode = head;

		Stack<Node> s = new Stack<>();

		while (curNode != null) {

			s.push(curNode);
			curNode = curNode.next;

		}

		Node curNode1 = s.pop();

		for (Node n : s) {
			curNode1.next = n;

		}

		while (curNode1 != null) {

			curNode1 = curNode1.next;
			System.out.println(curNode1.data);
			

		}

	}
}
