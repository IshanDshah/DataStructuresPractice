package linkedList;

public class DeleteDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListNode obj = new ListNode();
		ListNode head = obj.populateList();

		ListNode node = deleteDuplicates(head);
		while (node != null) {

			System.out.println(node.val);
			node = node.link;
		}
	}

	private static ListNode deleteDuplicates(ListNode p) {

		if (p == null || p.link == null) {
			return p;
		}
		ListNode head = p;
		while (head.link != null) {
			if (head.val == head.link.val) {
				head.link = head.link.link;
			} else {
				head = head.link;
			}

		}

		return p;
	}

}
