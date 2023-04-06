package ds.linkedlist;

public class Tester1 {

	public static void main(String[] args) {

		NodeStr n4 = new NodeStr("D", null);
	    NodeStr n3 = new NodeStr("C", n4);
	    NodeStr n2 = new NodeStr("B", n3);
	    NodeStr n1 = new NodeStr("C", n2);


	    System.out.println(n1.next.next.value);

	    
	}

}
