package linklist;

public class LinkList {
	public LinkList() {
		this.length=0;
	}
	public int length;
	public Node head;
	public Node returnHead() {

		return head;
	}


	public void insertAtHead(Node node) {

		node.setNext(head);
		head=node;
		length++;

	}
	public void insertAtLast(Node node) {
		Node temp=head;
		while(temp.getNext()!=null) {
			temp=temp.getNext();


		}
		temp.setNext(node);
		length++;


	}
	public void insertAtAny(int data,int pos) {

		Node temp=new Node(data);

		if(pos<0)
		{

			pos=0;
		}
		else	if(pos>length) {

			pos=length;
		}
		else if(pos==0) {

			insertAtHead(temp);
		}
		else 	if(pos==length) {
			insertAtLast(temp);
		}
		else {

			int i=1;
			Node newTemp=head;
			while(i<pos) {

				newTemp=newTemp.getNext();
				i++;
			}

			temp.setNext(newTemp.getNext());
			newTemp.setNext(temp);

			length++;
		}




	}
	
	public Node delFromLast() {
		
  Node temp=head;
  Node ret=null;
  while(temp.getNext().getNext()!=null) {
	  
	  temp=temp.getNext();
  }
  
  ret=temp.getNext();
  ret.setNext(null);
  temp.setNext(null);
  length--;
  return ret;

  
  
  
	}
public Node nodeFromLast(int x) {
	
	Node tem1=head;
	Node tem2=head;
	int z=0;
	while(tem2!=null) {
		
		if(z<x) {
			z++;
			tem2=tem2.getNext();
		}
		
		else {
			
			tem1=tem1.getNext();
			tem2=tem2.getNext();
		}
	
		
	}
	return tem1;
	
}
int count =0;
public Node nodeFromLastUsingRecursion(Node head,int x) {
	Node n=null;
	if(head!=null) {
  n=(nodeFromLastUsingRecursion(head.getNext(), x));
		count++;
		System.out.println("count="+count);
		if(count==x) {
			System.out.println("enter");
			return head;
		}
		
		
	}
	return n;
	
}

public LinkList reverseAlinkList(Node head) {
	
	Node current=head;
	Node prev=null;
	
	
	
	while(current!=null) {
	Node	next=current.getNext();
	current.setNext(prev);
	prev=current;
	current=next;
		
		
		
	}
	this.head=prev;
	return this;
	
	
}
public Node returnMiddle() {
	
	Node fast=head;
	Node slow=head;
	while(fast.getNext()!=null) {
		
		fast=fast.getNext().getNext();
		slow=slow.getNext();
		
	}
	return slow;
	
}

	@Override
	public String toString() {
		return "LinkList [head=" + head + "]";
	}


	public void printInReverse(Node head2) {
		
		
		if(head2==null) {
			return;
			
		}
		printInReverse(head2.getNext());
		
		System.out.println(head2.getX());
		// TODO Auto-generated method stub
		
	}


}
