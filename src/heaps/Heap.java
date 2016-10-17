package heaps;

import java.util.ArrayList;
import java.util.List;

public class Heap<T extends Comparable <T>> {
	
	private List<T> heap;
	
	public Heap(){
		this.heap = new ArrayList<>();
	}
	
	private void siftUp(){
		int element = heap.size()-1;
		
		while(element > 0){
			//find parent
			int parent = (int)(element - 1) / 2;
			T elem_obj = heap.get(element);
			T parent_obj = heap.get(parent);
			
			if (elem_obj.compareTo(parent_obj) > 0){
				//swap
				heap.set(element, parent_obj);
				heap.set(parent, elem_obj);
				
				//move up one level
				element = parent;				
			}else{
				//child smaller than parent
				break;
			}
		}
	}
	
	private void siftDown(){
		int element = 0;
		int left = 2 * element + 1;
		while(left < heap.size()){
			int max = left;
			int right = left + 1;
			if (right < heap.size()){
				T left_obj = heap.get(left);
				T right_obj = heap.get(right);
				
				if (left_obj.compareTo(right_obj) > 0){
					T temp = heap.get(element);
					heap.set(element, heap.get(max));
					heap.set(max, temp);
					element = max;
					left = 2 * element + 1;
				}
			}else{
				break;
			}
			
		}
	}
	
	

}
