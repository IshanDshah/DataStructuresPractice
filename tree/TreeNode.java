package tree;

public class TreeNode {

	int value;
	TreeNode left;
	TreeNode right;
	
	TreeNode(int x){
		value=x;
	 }
	public TreeNode() {
		// TODO Auto-generated constructor stub
	}

	protected static  TreeNode populateTree() {
		TreeNode root=new TreeNode(4);
		root.left=new TreeNode(2);
		root.right=new TreeNode(6);
		root.right.right=new TreeNode(7);
		root.right.left=new TreeNode(5);
		root.left.left=new TreeNode(1);
		root.left.right=new TreeNode(3);
		
		return root;
	}
}