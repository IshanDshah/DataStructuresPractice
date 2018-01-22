package linkedList;

public class PartitionList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode obj=new ListNode();
		ListNode head=obj.populateList();
		
		
		partitionlist(head,1);
	}

	private static void partitionlist(ListNode head, int i) {
		// TODO Auto-generated method stub
		
		ListNode node=head;
		ListNode p1=null;
		ListNode p2=null; 
		
		while(node!=null)
		{
			if(node.val<i)
			{
				p1=node;
				p1.val=node.val;
				node=node.link;
			}else{
				
				p2=node;
				p2.val=node.val;
				node=node.link;
			}
			
			
		}
		
		ListNode node2=head;
		
		while(node2!=null){
			
			
		}
		
	}

}
