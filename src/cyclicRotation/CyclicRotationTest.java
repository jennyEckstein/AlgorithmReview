package cyclicRotation;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CyclicRotationTest {
	
	private CyclicRotation cyclicRotation;
	private int [] array = {3,8,9,7,6};

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
		
	}

}
