package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Preorder {
//Left will be processed after right 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TreeNode ob = new TreeNode();

		TreeNode root = TreeNode.populateTree();
		
		List<Integer> ls=new ArrayList<>();
		
		Stack<TreeNode> sc=new Stack<>();
		sc.push(root);
		
		while(!sc.isEmpty()){
			TreeNode s=sc.pop();
			ls.add(s.value);
			
			if(s.left!=null){
				sc.push(s.left);
			}
			
			if(s.right!=null){
				sc.push(s.right);
			}
			
			
		}
		System.out.println(ls);

	}

}
