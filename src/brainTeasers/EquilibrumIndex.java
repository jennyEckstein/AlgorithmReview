package brainTeasers;

public class EquilibrumIndex {
	
	 public int solution(int[] A) {

	    int[] left = new int[A.length];
	    int[] right = new int[A.length];
	    
	    for (int i = 1; i < A.length; i++){
	           	           
	           for (int j = i; j >= 0; j--){
	               if (j == 0){
	                   left[0] = A[0]; 
	               }
	                left[i] = left[i] + A[j];   
	           }
	    }    
	        
	    
	    for (int i1 = right.length - 1; i1 >= 0; i1--){
	                      
	           for (int j1 = i1; j1 < A.length; j1++){
	               if (j1 == 0){
	                   right[0] = A[0]; 
	               }
	                right[i1] = right[i1] + A[j1];   
	           }
	    }
	   
	    
	    for (int k = 0; k < A.length; k++){
	        if (left[k] == right[k]){
	            if (k > 0 && k < A.length-1){
	                if (left[k-1] == right[k+1]){
	                return k;
	                }
	            }else{
	                return 0;
	            }
	        }
	    }
	    
	    return -1;
	    }
	 
	 public static void main (String [] args){
		 int [] array = {-1,3,-4,5,1,-6,2,1};
		 
		 EquilibrumIndex qIndex = new EquilibrumIndex();
		 
		 System.out.println(qIndex.solution(array));
	 }


}
