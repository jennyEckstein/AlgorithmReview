package sortingAlgorithms;

public class BubbleSortAlgorithm {
	
	private int [] arrayToSort; 

	public BubbleSortAlgorithm(int [] array){
		this.arrayToSort = array;
	}
	
	public int [] bubbleSort(){
		
		return null;
	}
	
	public static void main(String[] args) {
		
		int [] unsortedArray = {9,8,7,6,5,4,3,2,1};
		
		BubbleSortAlgorithm useBubbleSort = new BubbleSortAlgorithm(unsortedArray);
		int [] sortedArray = useBubbleSort.bubbleSort();
		
		if (sortedArray != null){
			System.out.println("Unsorted Array");
			for (int unsortedValue: unsortedArray){
				System.out.print(unsortedValue + ", ");
			}
			
			System.out.println("Sorted Array");
			for (int sortedValue: sortedArray){
				System.out.print(sortedValue + ", ");
			}
		}else{
			System.out.println ("Sorted array is null");
		}

	}

}
