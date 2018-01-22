package tree;

public class FindMinandMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = TreeNode.populateTree();

		
		//Iterative approach
		findMin(root);
		findMax(root);

	}

	private static void findMax(TreeNode root) {

		while (root.left != null) {
			root = root.left;
		}
		System.out.println("Min value is " + root.value);

	}

	private static void findMin(TreeNode root) {

		while (root.right != null) {
			root = root.right;
		}
		System.out.println("Max value is " + root.value);
	}

}
