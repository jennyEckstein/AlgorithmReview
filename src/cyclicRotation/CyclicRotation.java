package cyclicRotation;

public class CyclicRotation {
	
	public int[] solution (int [] array, int shiftTimes){
		
		// if you shif the same number of time s as in array all elements will end up in the
				//same place anyway
				if (array.length == shiftTimes){
					return array;
				}
				
				if(array.length <= 1){
					return array;
				}
				
				/*
				 * if shift times are larger than the size of the array we can just deduct 
				 * the shift so we do not go in circles
				 */
				if (array.length < shiftTimes){
					shiftTimes = shiftTimes % array.length;
				}
				
				int [] shiftedArray = new int [array.length];
				
				for (int i = 0; i < shiftedArray.length; i++){
					
					if ((i + shiftTimes) > (shiftedArray.length-1)){
						int fromBegining = (i + shiftTimes) - (shiftedArray.length);
						shiftedArray[fromBegining] = array[i];
					}else{
						shiftedArray[i+shiftTimes] = array[i];
					}
				}
				
				return shiftedArray;
	}
}
