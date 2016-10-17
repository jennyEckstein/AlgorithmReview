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
	
	

}
