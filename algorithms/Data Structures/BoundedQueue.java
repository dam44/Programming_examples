package fixedSizeQueue;

import java.util.ArrayList;
import java.util.Arrays;

public class BoundedQueue {

	Object[] queue;
	
	public BoundedQueue() {
		queue = new Object[20];
	}
	
	public BoundedQueue(int setSize) {
		queue = new Object[setSize];
	}
	
	public void add(Object o){
		ArrayList<Object> aLQueue;
		aLQueue = new ArrayList<Object>(Arrays.asList(queue));
		aLQueue.add(0, o);
		queue = aLQueue.toArray();
	}
	
	public Object head() {
		return queue[queue.length - 1];
	}
	
	public static void main(String[] args) {
		new BoundedQueue();

	}

}
