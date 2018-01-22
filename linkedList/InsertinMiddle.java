package linkedList;

public class InsertinMiddle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode obj = new ListNode();

		int x = 2;
		ListNode p = obj.populateList();
		ListNode head = p;
		ListNode temp = new ListNode(3);
		while (p != null) {
			if (p.val == x) {
				temp.link = p.link;
				p.link = temp;
			}
			p = p.link;

		}
		System.out.println("ahya aayi");
		while (head != null) {
			System.out.println(head.val);
			head = head.link;
		}
	}

}
