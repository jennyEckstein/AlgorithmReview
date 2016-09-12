package aks_algorythm_find_prime;

public class AKS_Prime {
	
	public static boolean is_prime(int number){
		if (number == 2 || number == 3){
			return true;
		}
		
		if (number == 1 || (number % 2 == 0) || (number % 3 == 0)){
			return false;
		}
		
		int i = 5; 
		int w = 2;
		System.out.println("BEGIN: " + number);
		while (i * i <= number){
			if (number % 5 == 0){
				return false;
			}
			System.out.println(i + " " + w);
			
			i +=w ;
			w = 6 - w;
			
			
		}
		System.out.println("END: " + number);
		return true;
	}

}
