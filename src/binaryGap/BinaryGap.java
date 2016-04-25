package binaryGap;

public class BinaryGap {
	public int solution(int N) {
        // write your code in Java SE 8
        
        String binaryRepresentation = Integer.toBinaryString(N);
        
        int [] binary = new int [binaryRepresentation.length()];
        
        for (int i = 0; i < binary.length; i++){
            binary[i] = Integer.parseInt(binaryRepresentation.substring(i, i+1));   
        }
        
        int smallestSum = 0;
        int sum = 0;
        
        for (int k = 0; k < binary.length; k++){
               if (binary[k] == 0){
                    sum++;   
               }else{
                   if (smallestSum < sum){
                       smallestSum = sum;
                       
                   }
                   sum = 0;
               }
               
        }
      
        return smallestSum;
    }
}
