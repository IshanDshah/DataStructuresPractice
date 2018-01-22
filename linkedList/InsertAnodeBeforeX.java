package linkedList;

public class InsertAnodeBeforeX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode ob=new ListNode();
		ListNode p=ob.populateList();
		int x=4;
		ListNode temp=new ListNode(3);
		ListNode head = p;
		ListNode x1;
		
		while(p.link!=null){
			
			
			if(p.link.val==x)
			{

				//System.out.println(p.val);
				temp.link=p.link;
				p.link=temp;
				break;
				
			}
			p=p.link;
		}
		
		while (head != null) {
			System.out.println(head.val);
			head = head.link;
		}
		
		

	}

}
