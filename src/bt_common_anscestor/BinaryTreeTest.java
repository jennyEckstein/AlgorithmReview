package bt_common_anscestor;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import bt_common_anscestor.Node;

public class BinaryTreeTest {
	private BinaryTree bt;
	@Before
	public void setUp() throws Exception {
//						/20\
//					/10\	30
//				/5\		15\
//			3		7		17
		this.bt = new BinaryTree();
		Node newNode = new Node(20, null);
		Node level2left = new Node(10, newNode);
		Node level2right = new Node(30, newNode);
		newNode.left = level2left;
		newNode.right = level2right;
		
		Node level3left = new Node(5, level2left);
		Node level3right = new Node(15, level2left);
		
		level2left.left = level3left;
		level2left.right = level3right;
		
		Node level4left = new Node(3, level3left);
		Node level4right = new Node(7, level3left);
		
		level3left.left = level4left;
		level3left.right = level4right;
		
		Node level4right_right = new Node(17, level3right);
		level3right.right = level4right_right;
		this.bt.head = newNode;		
}

	@Test
	public void testInOrder() {
		Assert.assertEquals(
				this.bt.inOrder(this.bt.head, new StringBuilder()).toString(), 
				"3571015172030");		
	}
	@Test
	public void testPreOrder(){
		Assert.assertEquals(
				this.bt.preOrder(this.bt.head, new StringBuilder()).toString(), 
				"3751715103020");
	}

}
