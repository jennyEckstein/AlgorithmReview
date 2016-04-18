package sortingAlgorithms;

public class MergeSortAlgorithm {

	private int[] arrayToSort;

	public MergeSortAlgorithm(int[] array) {
		this.arrayToSort = array;
	}

	public int[] mergeSort() {
	
		return arrayToSort;
	}

	public static void main(String[] args) {
		System.out.println("Selection Sort Algorithm");
		//int[] unsortedArray = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		int[] unsortedArray = {23,42,4,16,8,15};
		
		MergeSortAlgorithm useBubbleSort = 
				new MergeSortAlgorithm(unsortedArray.clone());
		int[] sortedArray = useBubbleSort.mergeSort();
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
