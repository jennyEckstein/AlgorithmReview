package bt_common_anscestor;

public class BinaryTree {
	
	Node head;
	
	public BinaryTree(){
		this.head = null;
	}
	
	public Node common_ancestor_shift_up(Node a, Node b){
		//TODO: Calculate depth and find difference
		
		return null;
	}
	/**
	 * In Order used to primarily print BTS in asc order	 
	 */
	public StringBuilder inOrder(Node root, StringBuilder str){
		if(root.left != null){
			inOrder(root.left, str);
		}
		str.append(root.data);
		if(root.right != null){
			inOrder(root.right, str);
		}
		return str;
	}
	/**
	 * Useful for listing dependencies before the task
	 */
	public StringBuilder postOrder(Node root, StringBuilder str){
		
		if(root.left != null){
			postOrder(root.left, str);
		}
		if(root.right != null){
			postOrder(root.right, str);
		}		
		str.append(root.data);
		return str;
	}
	
	private int depth(Node node){
		int depth = 0;
		while(node.parent != null){
			node = node.parent;
			depth++;
		}
		return depth++;
	}	

}
