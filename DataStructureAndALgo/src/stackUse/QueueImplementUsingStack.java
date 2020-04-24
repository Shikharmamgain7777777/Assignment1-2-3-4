package stackUse;

import java.util.Stack;

public class QueueImplementUsingStack {
Stack<Integer> s1=new Stack<>();
Stack<Integer> s2=new Stack<>();
public void enque(Integer x) {
	
	s1.push(x);
	
	System.out.println(s1);
}
public Integer deque() {
	
	if(s2.isEmpty()) {
		
		if(s1.isEmpty()) {
			System.out.println("empty queue");
			return 0;
		}
		
		else {
			while(!s1.isEmpty()) {
				s2.push(s1.pop());
			}
			
			
			
		}
		
		
	}
		System.out.println("hi");
		System.out.println(s2);

	return s2.pop();	
	
}
public static void main(String[] args) {
	
	
	QueueImplementUsingStack q=new QueueImplementUsingStack();
	
	q.enque(1);
	q.enque(2);
	q.enque(3);
	q.enque(4);

	System.out.println(q.deque());
	q.enque(7);
	System.out.println(q.deque());
	
}


}
