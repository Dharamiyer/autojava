package revisePac;

import java.util.Stack;

public class BinaTree {
	public static class node {
		int data;
		node left;
		node right;
		public node(int data) {
			this.data = data;
		}
	}
	public static void inor(node root){
		Stack <node> s = new Stack<node>();
		if (root == null) return;
		node current = root;
		while(!s.isEmpty() || root != null) {
			if(current != null) {
				s.push(current);
				current = current.left;
			}
			else {
				if (s.isEmpty())return;
				node n = s.pop();
				System.out.println(n.data);
				current = n.right;
			}
		}
	}
	public static node createtree() {
		node root = new node(18);
		node rootleft = new node(6);
		node rootright = new node(27);
		node rll = new node(3);
		node rlr = new node(9);
		root.left= rootleft;
		root.right = rootright;
		rootleft.left = rll;
		rootleft.right = rlr;
		return root;
	}
	public static void main(String[] args) {
		BinaTree tree = new BinaTree();
		node root = tree.createtree();
		tree.inor(root);
	}


}
