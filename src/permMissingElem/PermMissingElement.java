package permMissingElem;

import java.util.Arrays;

public class PermMissingElement {
	
	public int solution(int[] array){
		
		if(array.length <= 1){
			return -1;
		}
		Arrays.sort(array);
		
		for (int i = 1; i < array.length; i++){
			
			int diff = array[i] - array[i-1];
			if (diff > 1){
				return (array[i-1] + 1);
			}
		}
		
		return -1;
	}
}
