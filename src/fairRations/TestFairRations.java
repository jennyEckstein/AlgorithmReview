package fairRations;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestFairRations {
	
	private FairRations fair;

	@Before
	public void setUp() throws Exception {
		this.fair = new FairRations();
	}

	@After
	public void tearDown() throws Exception {
		this.fair = null;
	}

	@Test
	public void testOddEachEnd() {
		int []array = {1, 2, 4, 6, 8, 1};
		Assert.assertEquals("10", fair.alg(6, array));
	}
	
	@Test
	public void testOddsEvenMiddle(){
		int [] array = {2,1,4,1,6,3,9,10};
		Assert.assertEquals("6", fair.alg(8, array));
	}
	
	@Test
	public void testOddOdds(){
		int []array = {1,1,1,1,1};
		Assert.assertEquals("NO", fair.alg(5, array));
	}

}
