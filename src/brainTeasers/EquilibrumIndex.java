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
	 
	 public int solutionOption2(int A[], int n){		 
			    int k, m, lsum, rsum; 
			    for(k = 0; k < n; ++k) { 
			        lsum = 0; rsum = 0;
			        for(m = 0; m < k; ++m) {
			        	lsum += A[m];
			        } 
			        for(m = k + 1; m < n; ++m){
			        	rsum += A[m];  
			        }
			        
			        if (lsum == rsum){
			        	return k;
			        }
			    } 
			    return -1; 	
	 }
	 
	 int solutionBest(int arr[], int n) {
		    if (n==0) return -1; 
		    long sum = 0;
		    int i; 
		    for(i=0;i<n;i++){
		    	sum+=(long) arr[i]; 
		    }

		    long sum_left = 0;    
		    for(i=0;i<n;i++) {
		        long sum_right = sum - sum_left - (long) arr[i];
		        if (sum_left == sum_right){
		        	return i;
		        }
		        sum_left += (long) arr[i];
		    } 
		    return -1; 
		} 

}
