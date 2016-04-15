package sortingAlgorithms;

public class InsertionSortAlgorithm {

	private int[] arrayToSort;

	public InsertionSortAlgorithm(int[] array) {
		this.arrayToSort = array;
	}

	public int[] insertionSort() {

		for (int i = 1; i < arrayToSort.length; i++){
			int currentElementSorted = arrayToSort[i];
			int prevLocation = i - 1; 
			
			while(prevLocation >= 0 && arrayToSort[prevLocation] > currentElementSorted){
				arrayToSort[prevLocation+1] = arrayToSort[prevLocation];
				prevLocation--;
			}
			arrayToSort[prevLocation+1] = currentElementSorted;
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
