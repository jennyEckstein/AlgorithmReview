package cyclicRotation;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CyclicRotationTest {
	
	private CyclicRotation cyclicRotation;
	private int [] array = {3,8,9,7,6};
	private int [] array1 = {3};

	@Before
	public void setUp() throws Exception {
		this.cyclicRotation = new CyclicRotation();
	}

	@After
	public void tearDown() throws Exception {
		this.cyclicRotation = null;
		this.array = null;
	}

	@Test
	public void test() {

		int[] returnedArray = cyclicRotation.solution(array, 1);
		
		assertTrue(returnedArray[2]== array[1]);
		assertTrue(returnedArray[0]== array[4]);
		
		returnedArray = cyclicRotation.solution(array1, 5);
		assertTrue(returnedArray[0] == array[0]);
		
		returnedArray = cyclicRotation.solution(array, 13);
				
		assertTrue(returnedArray[3]== array[0]);
		
		
	}

}
