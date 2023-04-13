package ds.linkedlist;

public class TesterCL {

	public static void main(String[] args) {

		CustomLinkedList cll = new CustomLinkedList();
	

		cll.add(1);
		cll.add(2);
		cll.add(3);
		cll.add(4);
		cll.add(5);
		cll.add(6);

	//	System.out.println(cll);

	//	cll.print();
	//	cll.findNthNode(5);
	//	boolean search = cll.search(10);
		
	//	System.out.println(search);

		//int x = 5;
	//	int x = 15;
	//	if (cll.search(cll.head, x))
	//		System.out.println("YES");
	//	else
	//		System.out.println("No");
		
	//	System.out.println();
		
	//	System.out.println(cll.getCount());
		
		cll.reverse();

	}

}
