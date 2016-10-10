package count_squares;

public class Count_Squares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Count_Squares count = new Count_Squares();
		int total_sq = count.solution(4, 17);
		
		System.out.println("Total Sqaures in range 4-17 is " + total_sq);

	}
	
	public int solution(int lower, int upper){
		
		int total_squares = 0;
		
		//if you only have negative numbers then there are no squares
		if (upper < 1){
			return total_squares;
		}
		
		int add = 3;
		int current_sq = 1;
		//you cannot have negative squares, nor the one that is zero
		if (lower < 1){
			lower = 1;
		}else{
			//find next square in range 
			//int current_sq = 0;
			for (int i = lower; i < upper; i++){
				if (Math.sqrt(i) % 1 == 0){
					current_sq = i;
					total_squares++;
				}
			}
			
			if (current_sq == 0){
				return total_squares;
			}else{
				int current_add = find_current_add(current_sq);
				
				for (int j = current_sq + current_add; j < upper;){
					total_squares++;
					current_add+=2;
					j+= current_add;
				}
			}
		}
		
		
		
		return total_squares;
	}
	
	public int find_current_add(int current){
		int current_add = 3;
		int init_sq = 1;
		
		while(init_sq != current){
			init_sq += current_add;
			current_add += 2;
		}
		
		return current_add;
	}

}
