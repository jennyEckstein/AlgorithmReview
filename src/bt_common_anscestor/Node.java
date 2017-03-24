package bt_common_anscestor;

public class Node{
	Node left;
	Node right;
	Node parent;
	int data;
	
	public Node(int data, Node parent){
		this.data = data;
		this.parent = parent;
	}
}