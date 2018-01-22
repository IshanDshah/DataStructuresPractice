package binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class Tree {

	int info;
	Tree left;
	Tree right;

	public Tree(int item) {
		info = item;
		left = right = null;
	}

	public static Tree populateTree() {

		Tree root = new Tree(5);
		root.left = new Tree(3);
		root.right = new Tree(6);
		root.left.right = new Tree(10);
		root.left.left = new Tree(11);
		return root;
	}

	public static void preOrder(Tree root) {
		if (root == null)
			return;
		System.out.println(root.info);
		preOrder(root.left);
		preOrder(root.right);

	}

	public static void inOrder(Tree root) {
		if (root == null)
			return;

		inOrder(root.left);
		System.out.println(root.info);
		inOrder(root.right);

	}

	public static void main(String[] args) {
		Tree root = populateTree();
		Tree root2 = populateTree();
		Tree root3 = populateTree();
		// preOrder(root);
		// inOrder(root2);
		levelOrder(root3);

	}

	private static void levelOrder(Tree root) {
		// TODO Auto-generated method stub

		Queue<Tree> q = new LinkedList<Tree>();

		if (root != null) {
			q.add(root);
			// System.out.println(q.peek());
		}

		while (!q.isEmpty()) {
			root = q.peek();
			System.out.println(q.poll().info);
			if (root.left != null)
				q.offer(root.left);
			if (root.right != null)
				q.offer(root.right);

		}

	}
}