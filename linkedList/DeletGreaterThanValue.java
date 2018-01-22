package linkedList;

public class DeletGreaterThanValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListNode obj = new ListNode();
		ListNode head = obj.populateList();

		ListNode team = deleteGreater(head, 4);
		obj.printList(team);
	}

	private static ListNode deleteGreater(ListNode head, int i) {
		// TODO Auto-generated method stub

		if (head == null || head.val > i)
			return null;

		ListNode p = head;
		while (p.link != null) {
			if (p.link.val > i) {
				p.link = p.link.link;
			} else {
				p = p.link;
			}
		}

		return head.val == i ? head.link : head;
	}

}
