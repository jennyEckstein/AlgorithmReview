package sortingAlgorithms;

public class SelectionSortAlgorithm {

	private int[] arrayToSort;

	public SelectionSortAlgorithm(int[] array) {
		this.arrayToSort = array;
	}

	public int[] selectionSort() {
	
		for (int i = 0; i < arrayToSort.length-1; i++){
			int currentMin = arrayToSort[i];
			
			int currentSwapPosition = -1;
			for(int j = i+1; j < arrayToSort.length; j++){
				if (currentMin > arrayToSort[j]){
					currentMin = arrayToSort[j];
					currentSwapPosition = j;
				}
			}
			if (currentSwapPosition != -1){
			    arrayToSort[currentSwapPosition] = arrayToSort[i];
			    arrayToSort[i] = currentMin;
			}
			
			
		}
		return arrayToSort;
	}

	public static void main(String[] args) {
		System.out.println("Selection Sort Algorithm");
		//int[] unsortedArray = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		int[] unsortedArray = {23,42,4,16,8,15};
		
		SelectionSortAlgorithm useBubbleSort = 
				new SelectionSortAlgorithm(unsortedArray.clone());
		int[] sortedArray = useBubbleSort.selectionSort();
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
