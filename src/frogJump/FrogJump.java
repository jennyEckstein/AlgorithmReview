package frogJump;

public class FrogJump {
	
	public int solution(int startLocation, int endLocation, int jumpSize){
		
		if(startLocation == endLocation){
			return 0;
		}
				
		int jumpSpace = endLocation - startLocation;
		double steps = (double) jumpSpace/jumpSize;
		//System.out.println(steps);
		return (int) Math.ceil(steps);
	}
}
