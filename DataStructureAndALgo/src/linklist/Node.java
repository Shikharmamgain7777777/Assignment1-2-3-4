package linklist;

public class Node {
private int x;
 private Node next;
public int getX() {
	return x;
}
public void setX(int x) {
	this.x = x;
}
@Override
public String toString() {
	return "Node [x=" + x + ", next=" + next + "]";
}
public Node getNext() {
	return next;
}
public Node(int x) {
	super();
	this.x = x;
}
public void setNext(Node next) {
	this.next = next;
}

}
