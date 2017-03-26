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
	 * Used to flatten the BTS into an array for example	 
	 */
	public StringBuilder inOrder(Node root, StringBuilder str){
		if(root.left != null){
			inOrder(root.left, str);
		}
		str.append(root.data);
		str.append("-");
		if(root.right != null){
			inOrder(root.right, str);
		}
		return str;
	}
	/**
	 * need to ec explore roots before the leaves 
	 */
	public StringBuilder preOrder(Node root, StringBuilder str){
		str.append(root.data);
		str.append("-");
		if(root.left != null){
			preOrder(root.left, str);
		}
		if(root.right != null){
			preOrder(root.right, str);
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
		str.append("-");
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
