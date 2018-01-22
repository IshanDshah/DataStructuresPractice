package linkedList;

public class DeleteNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListNode head = new ListNode(0);
		head.link = new ListNode(1);
		head.link.link = new ListNode(2);
		head.link.link.link = new ListNode(3);
		head.link.link.link.link = new ListNode(0);

		head = delete(head.link.link.link);
		print(head);
	}

	private static void print(ListNode head) {
		// TODO Auto-generated method stub
		while (head != null) {
			System.out.println(head.val);
			head = head.link;
		}
	}

	private static ListNode delete(ListNode node) {
		// TODO Auto-generated method stub
		node.val = node.link.val;
		node.link = node.link.link;
		return node;
	}
}
