package fairRations;

public class FairRations {
	
	public String alg(int total, int [] array){
        int total_subjects = total;
        int loaves[] = array;
        int total_odd = 0;
        for(int subject = 0; subject < total_subjects; subject++){
            loaves[subject] = array[subject];      
            if ((loaves[subject] % 2) != 0){
                total_odd++;
            }
        }
        
        if ((total_odd % 2) != 0){
            return "NO";
        }
        
        int total_loaves_given = 0;
        
        for (int i = 0; i < loaves.length; i++){
        	if((loaves[i] % 2) != 0){
        		if(	(i != 0 && (loaves[i-1] % 2) != 0 )|| i == (loaves.length-1)	){
        			loaves[i]++;
                    loaves[i-1]++;                   
        		}else{
        			loaves[i]++;
                    loaves[i+1]++;                    
        		}
        		total_loaves_given += 2;
        	}
        }

        return String.valueOf(total_loaves_given);
	}

	public static void main(String[] args) {
        
        
        
    }

}
