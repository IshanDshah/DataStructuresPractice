package linkedList;

public class InsertAtaGivenPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ListNode obn=new ListNode();
		ListNode p=obn.populateList();
		ListNode hw = null;
		int k=3;
		ListNode temp=new ListNode(15);
		
		
		for(int i=1;i<k && p!=null ;i++)
		{
			
			//System.out.println(p.val);
			p=p.link;
			
		}
		//System.out.println(p.val);
		temp.link=p;
		p=temp;
		//System.out.println(p.next.val);
		
		
		p=hw;
		while(hw!=null)
		{
			System.out.println(hw.val);
			hw=hw.link;
		}
		
		             
		
	}

}
