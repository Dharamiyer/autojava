package revisePac;
import java.util.Stack;

public class Btree {
	public static class Node{
		int data;
		Node left;
		Node right;
		public Node(int Data) {
			this.data = Data;
		}
	}
	
	public void inOrder(Node root) {
		if (root == null) return;
		Stack <Node> s = new Stack<Node>();
		Node current = root;
		while (!s.isEmpty() || root != null ) {
			if(current!=null)  
			   {  
				System.out.println("pushing current node and data :"+ current.data);
			    s.push(current);  
			    current=current.left;  
			   }  
			   else  
			   {  
				   if(s.isEmpty()) {
					   return;
				   }
			    Node n=s.pop(); 
			    System.out.print("Popping data ");
			    System.out.printf("%d ",n.data);  
			    current=n.right;  
			   }  	
		}
		
	}
	 public void inOrderrec(Node root) {  
		  if(root !=  null) {  
		   inOrderrec(root.left);  
		   //Visit the node by Printing the node data    
		   System.out.printf("%d ",root.data);  
		   inOrderrec(root.right);  
		  }  
		 }  
	
	 
	
	public static Node createBinaryTree()  
	 {  
	  Node rootNode =new Node(9);  
	  Node node18=new Node(18);  
	  Node node27=new Node(27);  
	  Node node36=new Node(36);  
	  Node node45=new Node(45);  
	  rootNode.left=node18;  
	  rootNode.right=node27;  
	  node18.left=node36;  
	  node18.right=node45;  
		    
	  return rootNode;  
	 }  
	
	public static void main(String[] args)  
	 {  
	  Btree bi=new Btree();  
	  // Creating a binary tree  
	  Node rootNode=createBinaryTree();  
	  	  
//	  System.out.println();  
//	  System.out.println("-------------------------");  
//	  System.out.println("Using Iterative solution:");  
//	  	 
//	  bi.inOrder(rootNode);  
//	  System.out.println("-------------------------");  
	  System.out.println("Using Recursive solution:");  
	  bi.inOrderrec(rootNode);
	 }  
	
}
