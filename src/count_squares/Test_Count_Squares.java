package count_squares;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Test_Count_Squares {
	
	private Count_Squares count;
	
	@Before
	public void setUp() throws Exception {
		this.count = new Count_Squares();
	}

	@After
	public void tearDown() throws Exception {
		this.count = null;
	}

	@Test
	public void testCase() {
		Assert.assertEquals(3, count.solution(4, 17));
	}
	
	@Test
	public void testCase_Modified() {
		Assert.assertEquals(3, count.solution(4, 17));
	}
	
	@Test
	public void testCase_from_one() {
		Assert.assertEquals(4, count.solution(1, 17));
	}
	
	@Test
	public void testCase_negative() {
		Assert.assertEquals(4, count.solution(-100, 17));
	}

}
