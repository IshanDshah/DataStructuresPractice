package stringarray;

public class RemoveDuplicatedMembers {

	public static void main(String[] args) {
		int[] arr={1,2,3,3};
		System.out.println(removeDuplicates(arr));
	}
	
		// TODO Auto-generated method stub

		
		public static int removeDuplicates(int[] nums) {
	        int len=nums.length;
	       if(len<2)
	           return nums.length;
	        int id=1;
	        for(int i=1;i<nums.length;++i){
	            
	            if(nums[i]!=nums[i-1])
	            {
	                nums[id++]=nums[i];
	                System.out.println(nums[id]);
	             //   System.out.println(id);
	            }
	        }
	        return id;
	        
	        
	}

}
