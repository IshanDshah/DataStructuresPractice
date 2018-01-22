package linkedList;

public class CheckCircular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListNode head = new ListNode(0);
		head.link = new ListNode(1);
		head.link.link = new ListNode(2);
		head.link.link.link = new ListNode(3);
		head.link.link.link.link = new ListNode(0);

		CheckCircular obj = new CheckCircular();
		boolean ans = obj.hasCycle(head);

		while (head != null) {
			System.out.println(head.val);
			head = head.link;
		}
		System.out.println(ans);
	}

	public boolean hasCycle(ListNode head) {

		if (head == null)
			return false;
		ListNode slow, fast;
		slow = head;
		fast = head;

		while (fast.link != null && fast.link.link != null) {

			slow = slow.link;
			fast = fast.link.link;

			if (slow.val == fast.val) {
				return true;
			}

		}
		return false;

	}

	public void delete(ListNode node) {
		// TODO Auto-generated method stub
		node.val=node.link.val;
		node.link=node.link.link;
		
		
		
		
		
	}

}
