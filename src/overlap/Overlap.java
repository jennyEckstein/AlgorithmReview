package overlap;

public class Overlap {
	
	public String overplap(int s1, int e1, int s2, int e2){
		
		/*
		 * two inside one and 
		 * one inside two should be always on top
		 * to prent overlapping cases
		 * */
		
		if(s2 < s1 && e1 < e2){
			return "one inside two";
		}else if(s1 < s2 && e2 < e1){
			return "two inside one";
		}else if (s1 < s2 && e1 > s2){
			return "1 overlaps 2";
		}else if(s2 < s1 && s1 < e2){
			return "2 overlaps 1";
		}else{
			return "do not overlap";
		}
		
		
	}

}
