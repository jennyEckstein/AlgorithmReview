package brainTeasers;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EqulibrumIndexJunit {
	
	private EquilibrumIndex eIndex;
	private final int [] array1 = {-1,3,-4,5,1,-6,2,1};
	private final int [] array2 = {};
	private final int [] array3 = {0,-1,4,-3,5,-5,7,-7};

	@Before
	public void setUp() throws Exception {
		this.eIndex = new EquilibrumIndex();
	}

	@After
	public void tearDown() throws Exception {
		eIndex = null;
	}

	@Test
	public void testMultipleEqulibrums() {
		//fail("Not yet implemented");
		int equilibrum = eIndex.solution(array1);
		assertTrue(equilibrum == 1);
		equilibrum = eIndex.solutionOption2(array1, array1.length);
		assertTrue(equilibrum == 1);
		equilibrum = eIndex.solutionBest(array1, array1.length);
		assertTrue(equilibrum == 1);
	}
	
	@Test
	public void testEmptyEquilibrum(){
		int equilibrum = eIndex.solution(array2);
		assertTrue(equilibrum == -1);
		equilibrum = eIndex.solutionOption2(array2, array2.length);
		assertTrue(equilibrum == -1);
		equilibrum = eIndex.solutionBest(array2, array2.length);
		assertTrue(equilibrum == -1);
	}
	
	@Test
	public void testZeroEquilibrum(){
		int equilibrum = eIndex.solution(array3);
		assertTrue(equilibrum == 0);
		equilibrum = eIndex.solutionOption2(array3, array3.length);
		assertTrue(equilibrum == 0);
		equilibrum = eIndex.solutionBest(array3, array3.length);
		assertTrue(equilibrum == 0);
	}

}
