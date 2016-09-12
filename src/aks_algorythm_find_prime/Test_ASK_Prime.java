package aks_algorythm_find_prime;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class Test_ASK_Prime {
	
	private AKS_Prime aks_prime = new AKS_Prime();
	
	@Test
	public void testPrime() {
		Assert.assertTrue(AKS_Prime.is_prime(1237));
	}
	
	@Test
	public void testPrimeLong() {
		Assert.assertTrue(!AKS_Prime.is_prime(1001));
	}

	@Test
	public void testOne() {
		Assert.assertTrue(!AKS_Prime.is_prime(1));
	}
	
	@Test
	public void testTwo() {
		Assert.assertTrue(AKS_Prime.is_prime(2));
	}
	
	@Test
	public void testThree() {
		Assert.assertTrue(aks_prime.is_prime(3));
	}
	
	@Test
	public void testDivideByTo() {
		Assert.assertTrue(!aks_prime.is_prime(4));
	}
	
	@Test
	public void testDivideByThree() {
		Assert.assertTrue(!aks_prime.is_prime(6));
	}
	

}
