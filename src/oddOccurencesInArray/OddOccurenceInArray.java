package oddOccurencesInArray;

import java.util.Arrays;
import java.util.List;

public class OddOccurenceInArray {
	
	public int solution (int [] array){
		
		if(array.length < 2){
			return -1;
		}
		
		int[] sorted  = array.clone();
		Arrays.sort(sorted);
		
		boolean odd = true;
		int number;
		int counter = 0;
		
		for(int i = 1; i < sorted.length; i++){
			if(sorted[i-1] == sorted[i]){
				odd = false;
			}else{
				if(odd){
					sorted[counter++] = sorted[i-1];
				}
			}
			odd = true;
		}
	}
	
	public static void main (String [] args){
		OddOccurenceInArray oddCOccurence = 
				new OddOccurenceInArray();
		
		int [] array = {9,3,9,3,9,7,9};
		
		int result = oddCOccurence.solution(array);
		System.out.println(result);
	}

}
