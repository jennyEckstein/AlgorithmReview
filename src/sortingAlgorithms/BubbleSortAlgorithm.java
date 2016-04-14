package sortingAlgorithms;

public class BubbleSortAlgorithm {

	private int[] arrayToSort;

	public BubbleSortAlgorithm(int[] array) {
		this.arrayToSort = array;
	}

	public int[] bubbleSort() {

		int temp;
		boolean sorted = false;
		while (!sorted) {
			sorted = true;
			for (int i = 0; i < arrayToSort.length - 1; i++) {
				if (arrayToSort[i] > arrayToSort[i + 1]) {
					temp = arrayToSort[i + 1];
					arrayToSort[i + 1] = arrayToSort[i];
					arrayToSort[i] = temp;
					sorted = false;
				}
			}
		}
		return arrayToSort;
	}

	public static void main(String[] args) {

		int[] unsortedArray = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };

		BubbleSortAlgorithm useBubbleSort = 
				new BubbleSortAlgorithm(unsortedArray.clone());
		int[] sortedArray = useBubbleSort.bubbleSort();
		System.out.println("Unsorted Array");
		for (int unsortedValue : unsortedArray) {
			System.out.print(unsortedValue + ", ");
		}
		if (sortedArray != null) {
			System.out.println("\nSorted Array");
			for (int sortedValue : sortedArray) {
				System.out.print(sortedValue + ", ");
			}
		} else {
			System.out.println("Sorted array is null");
		}

	}

}
