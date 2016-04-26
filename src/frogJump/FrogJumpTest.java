package frogJump;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FrogJumpTest {
	
	private FrogJump frogJump;

	@Before
	public void setUp() throws Exception {
		this.frogJump = new FrogJump();
	}

	@After
	public void tearDown() throws Exception {
		this.frogJump = null;
	}

	@Test
	public void testNoSpaceToJump() {
		//fail("Not yet implemented");
		 int steps = frogJump.solution(10, 10, 10);
		 assertTrue(steps == 0);
	}
	
	@Test
	public void testOneLongJump(){
		int steps = frogJump.solution(1, 10, 13);
		assertTrue(steps == 1);
	}
	
	@Test
	public void testManyLittleJumps(){
		int steps = frogJump.solution(2, 10, 2);
		assertTrue(steps == 4);
	}
	
	@Test
	public void testManyLittleOverflowJumps(){
		int steps = frogJump.solution(1, 10, 4);
		assertTrue(steps == 3);
	}

}
