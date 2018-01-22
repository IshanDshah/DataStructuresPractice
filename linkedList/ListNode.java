package linkedList;

public class ListNode {
	public int val;

	public ListNode link;

	public ListNode(int x) {
		val = x;
		link = null;

	}

	public ListNode() {
		// TODO Auto-generated constructor stub
	}

	public ListNode populateList() {

		ListNode head = new ListNode(0);
		head.link = new ListNode(1);
		head.link.link = new ListNode(2);
		head.link.link.link = new ListNode(2);
		head.link.link.link.link = new ListNode(5);
		head.link.link.link.link.link = new ListNode(5);
		head.link.link.link.link.link.link = new ListNode(5);
		return head;
	}

	public void printList(ListNode head) {
		if (head == null)
			System.out.println("Thef list is empty");

		while (head != null) {
			System.out.println(head.val);
			head = head.link;
		}

	}

	public static void main(String[] args) {
		ListNode ob = new ListNode();
		ListNode head = ob.populateList();

		if (head == null || head.link == null)
			System.out.println(head.val);

		ListNode p1 = head;
		ListNode p2 = p1.link;
		// System.out.println(head.next.val);
		head.link = null;
		while (p1 != null && p2 != null) {

			ListNode p3 = p2.link;
			// System.out.println(p3.val);
			p2.link = p1;
			// System.out.println("p3" + p3.val);
			p1 = p2;
			p2 = p3;
		}

		while (p1 != null) {

			p1 = p1.link;
		}
	}
}
