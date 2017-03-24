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
	
	private int depth(Node node){
		int depth = 0;
		while(node.parent != null){
			node = node.parent;
			depth++;
		}
		return depth++;
	}	

}
