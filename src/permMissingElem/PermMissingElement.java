package permMissingElem;

import java.util.Arrays;

public class PermMissingElement {
	
	public int solution(int[] array){
		
		if(array.length <= 1){
			return -1;
		}
		Arrays.sort(array);
		
		for (int i = 1; i < array.length; i++){
			if(array[i-1] != (array[i] + 1)){
				return (array[i]+1);
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			PermMissingElement permMissingElement =
					new PermMissingElement();
			
			int[] array = {2,3,1,5};
			
			
			int result = permMissingElement.solution(array);
			
			System.out.println(result);
	}

}
