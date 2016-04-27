package permMissingElem;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PermMissingElemTest {
	
	private PermMissingElement permMissingElem;

	@Before
	public void setUp() throws Exception {
		this.permMissingElem = new PermMissingElement();
	}

	@After
	public void tearDown() throws Exception {
		this.permMissingElem = null;
	}

	@Test
	public void testNormalArray() {
		//fail("Not yet implemented");
		int[] array = {2,3,1,5};	
		
		int result = permMissingElem.solution(array);
		
		assertTrue(result == 4);
		 
	}
	
	@Test 
	public void testEmptyArray(){
		int [] array = {};
		
		int result = permMissingElem.solution(array);
		assertTrue(result == -1);
	}
	
	@Test 
	public void testOneElementArray(){
		int [] array = {1};
		
		int result = permMissingElem.solution(array);
		assertTrue(result == -1);
	}

}
