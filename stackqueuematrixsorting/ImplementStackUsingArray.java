package stackqueuematrixsorting;

import java.util.Arrays;

public class ImplementStackUsingArray {
	private static int[] stackArr;
	private static int top;

	public ImplementStackUsingArray() {

		stackArr = new int[10];
		top = -1;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementStackUsingArray iobj = new ImplementStackUsingArray();

		iobj.push(5);
		iobj.push(15);
		iobj.push(25);
		iobj.push(35);
		iobj.push(45);
		iobj.pop();

		iobj.printStack(stackArr, top);

	}

	public void push(int x) {
		top += 1;
		stackArr[top] = x;
	}

	public int pop() {

		int x;
		if (isEmpty()) {
			System.out.println("Stack Underflow");
		}
		x = stackArr[top];
		top = top - 1;
		return x;
	}

	public int size() {
		return top + 1;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public void printStack(int[] stackArr2, int top) {
		for (int i = 0; i < top + 1; i++) {
			System.out.println(stackArr2[i]);

		}
	}

}
