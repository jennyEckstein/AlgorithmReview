package sortingAlgorithms;

public class InsertionSortAlgorithm {

	private int[] arrayToSort;

	public InsertionSortAlgorithm(int[] array) {
		this.arrayToSort = array;
	}

	public int[] insertionSort() {

		return null;
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
