package linkedList;

public class MergeTwoLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode obj = new ListNode();
		ListNode head1 = obj.populateList();

		ListNode head2 = obj.populateList();
		head2.link = new ListNode(6);
		head2.link.link = new ListNode(8);
		head2.link.link.link = new ListNode(11);
		// obj.printList(head2);
		// System.out.println("----------");
		// obj.printList(head1);
		ListNode head3 = merge(head1, head2);
		obj.printList(head3);
	}

	// Just merged them.Didn't follow the order
	private static ListNode merge(ListNode head1, ListNode head2) {
		// TODO Auto-generated method stub

		ListNode temp = new ListNode(-1);
		ListNode head3 = temp;
		int c1 = 0, c2 = 0;
		while (head1 != null && head2 != null) {

			if (head1 != null) {
				// System.out.println("HI");
				c1++;
				head3.link = head1;
				head1 = head1.link;
				head3 = head3.link;
			}
			if (head2 != null) {
				// System.out.println("HI2");
				c2++;
				head3.link = head2;
				head2 = head2.link;
				head3 = head3.link;
			}

		}

		if (head1 != null) {
			c1++;
			head3.link = head1;
		}
		if (head2 != null) {
			c2++;
			head3.link = head2;
		}
		// System.out.println(c1 + " " + c2);
		return temp.link;
	}

}
