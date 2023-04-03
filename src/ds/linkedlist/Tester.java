package ds.linkedlist;

public class Tester {

	public static void main(String[] args) {

		Node4 n4 = new Node4("D");
		Node3 n3 = new Node3("C",n4);
		Node2 n2 = new Node2("B", n3);
		Node1 n1 = new Node1("A", n2);
		
		
		System.out.println(n1.n2.n3.value);
	}

}
