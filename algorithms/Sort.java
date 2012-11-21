package sort;

public class Sort {
	
	public Sort(){}
	
	/**
	 * Sorts array of integers with largest at the top. O(n^2)
	 * @param list
	 */
	public int[] bubbleSort(int list[]) {
		boolean sorted = false;
		while (sorted == false) {
			sorted = true;
			for (int i = 0; i<list.length-1; i++) {
				if (list[i] > list[i+1]) {
					int temp = list[i];
					list[i] = list[i+1];	
					list[i+1] = temp;
					sorted = false;
				}
			}
		}
		return list;
	}
}
