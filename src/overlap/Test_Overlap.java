package overlap;

import org.junit.Assert;
import org.junit.Test;


public class Test_Overlap {
	
	Overlap overlap = new Overlap();
	
	@Test
	public void test_1_overlaps_2() {
		Assert.assertEquals("1 overlaps 2", overlap.overplap(1, 5, 4, 12));
	}
	
	@Test
	public void test_2_overlaps_1(){
		Assert.assertEquals("2 overlaps 1", overlap.overplap(4, 12, 1, 5));
	}
	
	@Test
	public void test_one_inside_two(){
		Assert.assertEquals("one inside two", overlap.overplap(3, 5, 1, 12));
	}
	
	@Test
	public void test_two_inside_one(){
		Assert.assertEquals("two inside one", overlap.overplap(1, 12, 3, 5));
	}
	
	@Test
	public void test_do_not_overlap(){
		Assert.assertEquals("do not overlap", overlap.overplap(1, 3, 5, 7));
	}

}
