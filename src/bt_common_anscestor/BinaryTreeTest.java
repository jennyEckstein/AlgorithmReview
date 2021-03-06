package bt_common_anscestor;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import bt_common_anscestor.Node;

public class BinaryTreeTest {
	private BinaryTree bt;
	private Node level4left;
	private Node level3left;
	private Node level2right;
	private Node newNode;
	
	@Before
	public void setUp() throws Exception {
//						/20\
//					/10\	30
//				/5\		15\
//			3		7		17
		this.bt = new BinaryTree();
		newNode = new Node(20, null);
		Node level2left = new Node(10, newNode);
		level2right = new Node(30, newNode);
		newNode.left = level2left;
		newNode.right = level2right;
		
		level3left = new Node(5, level2left);
		Node level3right = new Node(15, level2left);
		
		level2left.left = level3left;
		level2left.right = level3right;
		
		level4left = new Node(3, level3left);
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
				"3-5-7-10-15-17-20-30-");		
	}
	@Test
	public void testPreOrder(){
		Assert.assertEquals(
		this.bt.preOrder(this.bt.head, new StringBuilder()).toString(),
		"20-10-5-3-7-15-17-30-");
	}
	@Test
	public void testPostOrder(){
		Assert.assertEquals(
				this.bt.postOrder(this.bt.head, new StringBuilder()).toString(), 
				"3-7-5-17-15-10-30-20-");
	}
	@Test
	public void calculateDepth(){
		Assert.assertEquals(this.bt.depth(this.level4left), 4);
		Assert.assertEquals(this.bt.depth(this.level3left), 3);
		Assert.assertEquals(this.bt.depth(this.level2right), 2);
		Assert.assertEquals(this.bt.depth(this.newNode), 1);
		Assert.assertEquals(this.bt.depth(null), 0);
		
	}

}
