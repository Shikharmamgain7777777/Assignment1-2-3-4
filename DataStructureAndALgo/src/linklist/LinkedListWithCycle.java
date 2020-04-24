package linklist;

public class LinkedListWithCycle {


  
     @Override
	public String toString() {
		return "LinkedListWithCycle [head=" + head + "]";
	}
	Node head; 
  
    static class Node { 
  
        @Override
		public String toString() {
			return "Node [data=" + data + ", next=" + next + "]";
		}

		int data; 
        Node next; 
  
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } 
    }
    public static void main(String[] args) 
    { 
    	 LinkedListWithCycle list = new  LinkedListWithCycle(); 
        list.head = new Node(50); 
        list.head.next = new Node(20); 
        list.head.next.next = new Node(15); 
        list.head.next.next.next = new Node(4); 
        list.head.next.next.next.next = new Node(10); 
  
        // Creating a loop for testing 
        list.head.next.next.next.next.next = list.head.next.next; 
        System.out.println(list);
    } 
    






}