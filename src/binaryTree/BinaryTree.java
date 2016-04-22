package binaryTree;

public class BinaryTree {

	Node root;
	
	public void addNode(int key, String name){
		Node newNode = new Node(key, name);
		
		if (root == null){
			this.root = newNode;
		}else{
			Node focusNode = root;
			Node parent;
			
			while (true){
				parent = focusNode;
				if(key < focusNode.key){
					focusNode =  focusNode.leftChild;
					if(focusNode == null){
						parent.leftChild = newNode;
						return;
					}
				}else{
					focusNode = focusNode.rightChild;
					if(focusNode == null){
						parent.rightChild = newNode;
						return;
					}
				}
			}
		}
	}
	
	public Node findNode(int key){
		Node focusNode = root;
		while(focusNode.key != key){
			System.out.println (focusNode.key);
			if(key < focusNode.key){
				focusNode = focusNode.leftChild;
			}else{
				focusNode = focusNode.rightChild;
			}
			
			if(focusNode == null){
				return null;
			}
		}
		System.out.println (focusNode.key);
		return focusNode;
	}
	
	public void inOrderTraverseTree(Node focusNode){
		if (focusNode != null){
			inOrderTraverseTree(focusNode.leftChild);
			System.out.println(focusNode.toSting());
			inOrderTraverseTree(focusNode.rightChild);
		}
	}
	
	public void preOrderTraverseTree(Node focusNode){
		if (focusNode != null){
			System.out.println(focusNode.toSting());
			preOrderTraverseTree(focusNode.leftChild);
			preOrderTraverseTree(focusNode.rightChild);
		}
	}
	
	public void postOrderTraverseTree(Node focusNode){
		if (focusNode != null){			
			postOrderTraverseTree(focusNode.leftChild);
			postOrderTraverseTree(focusNode.rightChild);
			System.out.println(focusNode.toSting());
		}
	}
	
	public static void main (String [] args){
		BinaryTree tree = new BinaryTree();
		tree.addNode(50, "A");
		tree.addNode(25, "B");
		tree.addNode(15, "C");
		tree.addNode(30, "D");
		tree.addNode(75, "E");
		tree.addNode(85, "F");
		
		//tree.postOrderTraverseTree(tree.root);
		
		tree.findNode(30);
		
	}
}
