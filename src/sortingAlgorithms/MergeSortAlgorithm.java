package sortingAlgorithms;

public class MergeSortAlgorithm {

	public void mergeSort(int[] array, int low, int high) {
		int size = array.length;
		if(low < high){
			int middle = (low + high) / 2;
			mergeSort(array, low, middle);
			mergeSort(array, middle+1, high);
			merge(array, low,middle, high);
		}
		
		//return arrayToSort;
	}
	
	private void merge(int [] array, int low, int middle, int high){
		int size = array.length;
		int[] temp = new int[size];
		for (int i = low; i <= high; ++i){
			temp[i] = array[i];
		}
		int i = low;
		int j  = middle + 1;
		int k = low;
		
		while (i <= middle && j <= high){
			if (temp[i] <= temp[j]){
				array[k] = temp[i];
				++i;
			}else{
				array[k] = temp[j];
				++j;
			}
			++k;
		}
		
		while (i <= middle){
			array[k] = temp[i];
			++k;
			++i;
		}
	}

	public static void main(String[] args) {
		System.out.println("Selection Sort Algorithm");
		//int[] unsortedArray = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		int[] unsortedArray = {23,42,4,16,8,15};
		System.out.println("Unsorted Array");
		for (int unsortedValue : unsortedArray) {
			System.out.print(unsortedValue + ", ");
		}
		MergeSortAlgorithm useBubbleSort = 
				new MergeSortAlgorithm();
		useBubbleSort.mergeSort(unsortedArray, 0, unsortedArray.length-1);
		
		System.out.println("\nSorted Array");
		for (int sortedValue : unsortedArray) {
			System.out.print(sortedValue + ", ");
		}

	}

}
