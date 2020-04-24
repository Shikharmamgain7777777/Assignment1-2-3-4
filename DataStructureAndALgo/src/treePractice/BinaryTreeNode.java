package treePractice;

public class BinaryTreeNode {
private	int data;
	private BinaryTreeNode left;
	private BinaryTreeNode rigth;
	public BinaryTreeNode(int data, BinaryTreeNode left, BinaryTreeNode rigth) {
		super();
		this.data = data;
		this.left = left;
		this.rigth = rigth;
	}
	public BinaryTreeNode() {
		// TODO Auto-generated constructor stub
		this.data=0;
		this.left=null;
		this.rigth=null;
	}
	public int getData() {
		return data;
	}
	@Override
	public String toString() {
		return "BinaryTreeNode [data=" + data + ", left=" + left + ", rigth=" + rigth + "]";
	}
	public void setData(int data) {
		this.data = data;
	}
	public BinaryTreeNode getLeft() {
		return left;
	}
	public void setLeft(BinaryTreeNode left) {
		this.left = left;
	}
	public BinaryTreeNode getRigth() {
		return rigth;
	}
	public void setRigth(BinaryTreeNode rigth) {
		this.rigth = rigth;
	}

}
