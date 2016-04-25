package binaryGap;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BinaryGapTest {
	
	private BinaryGap binaryGap;
	private int [] valuesArray = {
			1041,15,66561,805306373
	};
		
	
	@Before
	public void setUp() throws Exception {
		this.binaryGap = new BinaryGap();
	}

	@After
	public void tearDown() throws Exception {
		this.binaryGap = null;
	}

	@Test
	public void test() {
		
		int result;
		result = binaryGap.solution(valuesArray[0]);
		assertTrue(result == 5);
		result = binaryGap.solution(valuesArray[1]);
		assertTrue(result == 0);
		result = binaryGap.solution(valuesArray[2]);
		assertTrue(result == 9);
		result = binaryGap.solution(valuesArray[3]);
		assertTrue(result == 25);
	}

}
