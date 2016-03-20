package Sorting;
public class BubbleSort {
	/**
	 * bubbleSort				sorts an array of integers using bubble sort
	 * 
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] bubbleSort(int[] unsortedArray) {
		int temp;
		for (int i = 0; i < unsortedArray.length - 1; i++) {
			for (int j = 1; j < unsortedArray.length - i; j++) {
				if (unsortedArray[j - 1] > unsortedArray[j]) {
					temp = unsortedArray[j - 1];
					unsortedArray[j - 1] = unsortedArray[j];
					unsortedArray[j] = temp;
				}
			}
		}
		return unsortedArray;
	}
}
