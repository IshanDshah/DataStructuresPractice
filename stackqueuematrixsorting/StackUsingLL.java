package stackqueuematrixsorting;

import linkedList.ListNode;

public class StackUsingLL {

	static ListNode top;
	int maxSize = 10;

	public StackUsingLL() {

		top = null;
	}

	public void push(int info) {
		// if (isFull()) {
		// System.out.println("Stack is overflow");
		// return;
		// }
		ListNode x = new ListNode(info);
		x.link = top;
		top = x;

	}

	public int pop() {
		int x = top.val;
		top = top.link;
		return x;
	}

	public boolean isEmpty() {

		return top == null;
	}

	public int peek() {

		return top != null ? top.val : 0;
	}

	public static void main(String[] args) {
		StackUsingLL obj = new StackUsingLL();
		obj.push(1);
		obj.push(2);
		obj.push(3);
		obj.push(4);
		obj.pop();
		//System.out.println(obj.pop());

		ListNode p = top;
		while (p != null) {
			System.out.println(p.val);
			p = p.link;
		}
	}

	// public boolean isFull() {
	// //return
	// }

}
