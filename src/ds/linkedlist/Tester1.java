package ds.linkedlist;

public class Tester1 {

	public static void main(String[] args) {

		Node n4 = new Node("D", null);
	    Node n3 = new Node("C", n4);
	    Node n2 = new Node("B", n3);
	    Node n1 = new Node("C", n2);


	    System.out.println(n1.next.next.value);

	    
	}

}
