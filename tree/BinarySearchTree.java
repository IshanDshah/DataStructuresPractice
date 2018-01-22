package tree;

public class BinarySearchTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Iterative approach
		long currentTime = System.nanoTime();
		System.out.println(search(1));
		long time2 = System.nanoTime();
		System.out.println("First method took" + ((time2 - currentTime)/10000));
		
		
		//Recursive approach
		TreeNode root = TreeNode.populateTree();
		System.out.println(searchRec(root, 5));
		System.out.println((System.nanoTime() - time2)/10000);
	}

	// Recursive approach
	private static boolean searchRec(TreeNode root, int i) {

		if (root.value == i) {
			return true;
		} else if (root.value < i) {
			return searchRec(root.right, i);
		} else if ((root.value > i)) {
			return searchRec(root.left, i);
		}

		return false;
	}

	// Iterative approach
	private static boolean search(int i) {
		// TODO Auto-generated method stub

		TreeNode root = TreeNode.populateTree();

		while (root != null) {
			if (root.value < i) {
				root = root.right;
			} else if (root.value > i) {
				root = root.left;
			} else if (root.value == i) {
				return true;
			}

		}

		return false;
	}

}
