package treePractice;

import java.util.LinkedList;
import java.util.Queue;

public class DriverClassForLevelOrderInOrderPrePostTRav {
	public static void main(String[] args) {
		
		

		
		
		BinaryTreeNode bt=new BinaryTreeNode();
		bt.setData(20);
		bt.setLeft(new BinaryTreeNode(10,new BinaryTreeNode(3,new BinaryTreeNode(),new BinaryTreeNode()),new BinaryTreeNode(11,new BinaryTreeNode(),new BinaryTreeNode())));
		bt.setRigth(new BinaryTreeNode(30,new BinaryTreeNode(25,new BinaryTreeNode(),new BinaryTreeNode()),new BinaryTreeNode(35,new BinaryTreeNode(),new BinaryTreeNode())));
System.out.println(bt);

//level order traversal


printLevelOrderTraversal(bt);



//////////////////preorder traversal

printPreOrderTraversal(bt);
printInOrderTraversal(bt);
printPostOrderTraversal(bt);




	}

	private static void printPostOrderTraversal(BinaryTreeNode bt) {
		// TODO Auto-generated method stub
	if(bt==null) {
			
			return;
		}
		
	printPostOrderTraversal(bt.getLeft());
	printPostOrderTraversal(bt.getRigth());
		System.out.println(bt.getData());
		
	}

	private static void printInOrderTraversal(BinaryTreeNode bt) {
		// TODO Auto-generated method stub
	if(bt==null) {
			
			return;
		}
		
	printInOrderTraversal(bt.getLeft());
		System.out.println(bt.getData());
		printInOrderTraversal(bt.getRigth());
		
	}

	private static void printPreOrderTraversal(BinaryTreeNode bt) {
		// TODO Auto-generated method stub
		if(bt==null) {
			
			return;
		}
		System.out.println(bt.getData());
		printPreOrderTraversal(bt.getLeft());
		printPreOrderTraversal(bt.getRigth());
	}

	private static void printLevelOrderTraversal(BinaryTreeNode bt) {
		// TODO Auto-generated method stub
		Queue<BinaryTreeNode> q=new LinkedList<>();
		if(bt==null)
			System.out.println("empty");
		q.add(bt);
		
		while(!q.isEmpty()) {
			BinaryTreeNode node=q.peek();
			System.out.println(node.getData());
			if(node.getLeft()!=null) {
				/*System.out.println(node.getLeft().getData()+"      1     ");*/
				q.add(node.getLeft());
			}
if(node.getRigth()!=null) {
/*	System.out.println(node.getRigth().getData()+"     2         ");
*/				
				q.add(node.getRigth());
			}
/*System.out.println("bef"+q);
*/q.remove();
/*System.out.println("after"+q);
*/			
			
			
			
			
		}
		
	}

}
