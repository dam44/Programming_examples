package fixedSizeStack;


public class BoundedStack {

	Object[] stack;
	int nextIndex = 0;
	
	public BoundedStack() {
		stack = new Object[20];
	}
	
	public BoundedStack(int setSize) {
		stack = new Object[setSize];
	}

	public void push(Object o) {
		if (stack.length <= nextIndex) {
			throw new StackOverflowError();
		}
		else {
		stack[nextIndex] = o;
		nextIndex++;
		}
	}
	
	public Object pop() {
		nextIndex--;
		return stack[nextIndex];
		
	}
	
	public int sizeOf() {
		return stack.length;
	}
	
	
	public static void main(String[] args) {
		new BoundedStack();
	}

}
