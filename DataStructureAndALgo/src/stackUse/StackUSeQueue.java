package stackUse;

import java.util.LinkedList;
import java.util.Queue;

public class StackUSeQueue {
Queue<Integer> q1=new LinkedList<>();
Queue<Integer> q2=new LinkedList<>();
public void push(int x) {
	if(q2.isEmpty())
	q1.add(x);
	if(q1.isEmpty())
		q2.add(x);
	
}
public int pop() {
	
	
	
	if(q1.isEmpty()) {
		if(q2.isEmpty()) {
			
			System.out.println("empty");
			return 0;
		}
		else {
			
			
			while(q2.size()>1) {
				Integer x=q2.poll();
				q1.add(x);
				
			}
			return q2.poll();
		}
		
		
		
		
	}
	else {
		while(q1.size()>1) {
			Integer x=q1.poll();
			q2.add(x);
			
		}
		return q1.poll();
	}
		
		
		
	}
public static void main(String[] args) {
	
	StackUSeQueue s=new StackUSeQueue();
	s.push(1);
	s.push(2);
	s.push(3);
	System.out.println(s);
	System.out.println(s.pop());
	s.push(4);
	System.out.println(s);
	System.out.println(s.pop());
	

s.push(5);
}
@Override
public String toString() {
	return "StackUSeQueue [q1=" + q1 + ", q2=" + q2 + "]";
}
}


