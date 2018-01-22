package linkedList;

public class AddtwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ListNode head = new ListNode(3);
		head.link = new ListNode(2);
		head.link.link = new ListNode(6);
		
		
		
		ListNode head2 = new ListNode(1);
		head2.link = new ListNode(2);
		head2.link.link = new ListNode(9);
		
		add(head,head2);
		
	}

	private static void add(ListNode l1, ListNode l2) {
		// TODO Auto-generated method stub
		
		int carry =0;
		 
        ListNode newHead = new ListNode(0);
        ListNode p1 = l1, p2 = l2, p3=newHead;
 
        while(p1 != null || p2 != null){
            if(p1 != null){
                carry += p1.val;
                p1 = p1.link;
            }
 
            if(p2 != null){
                carry += p2.val;
                p2 = p2.link;
            }
 
            p3.link = new ListNode(carry%10);
            p3 = p3.link;
            carry /= 10;
        }
 
        if(carry==1) 
            p3.link=new ListNode(1);
 
       while(newHead.link!=null)
       {
    	   System.out.println(newHead.val);
    	   newHead=newHead.link;
       }
		
		
	}

}
