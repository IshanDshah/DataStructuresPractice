package linkedList;

public class ReverseLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListNode obj = new ListNode();
		ListNode head = obj.populateList();

		ListNode p = head;
		ListNode next,prev=null;

	
		while (p != null) {
			next=p.link;
			p.link=prev;
			prev=p;
			p=next;
			

		}
		head=prev;
		
		while(head!=null)
		{
			System.out.println(head.val);
			head=head.link;
		}
	}

}
