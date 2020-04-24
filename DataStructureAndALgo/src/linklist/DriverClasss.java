package linklist;

import java.util.LinkedHashSet;
import java.util.Set;

public class DriverClasss {
	public static void main(String[] args) {
		
		LinkList l=new LinkList();
		Node j=new Node(5);
		l.insertAtHead(j);
		Node k=new Node(6);
		l.insertAtHead(k);
		l.insertAtLast(new Node(7));
		l.insertAtLast(new Node(7));
		l.insertAtHead(new Node(1));
         l.insertAtAny(55, 0);
         l.insertAtAny(550, 1);
         l.insertAtAny(1, 1);
       
		System.out.println(l);
            System.out.println(l.delFromLast());
            System.out.println(l);
             System.out.println(l.nodeFromLast(3));//node from lastt in single iteration
             
           Node x1=l.head;
          Node   x=l.nodeFromLastUsingRecursion(x1, 3);//nodefrom last  using recursion
             System.out.println("i"+x);
             LinkList l1=l;
             System.out.println("before reversal"+l1);
             
             
           //printing in reverse
             
             l.printInReverse(l.head);
             
             
          System.out.println("after reversal" +l1.reverseAlinkList(x1));//reversing a linklist
          
          ///middle of a link list
          
          System.out.println(l1.returnMiddle().getX());//element in the middle of the linklist
          
          //to find the intersection of the 2 link list
          
          
          LinkList link1=new LinkList();
          link1.insertAtHead(new Node(1));
          link1.insertAtLast(new Node(2));
          link1.insertAtLast(new Node(3));
          LinkList link2=new LinkList();
          link2.insertAtHead(new Node(1));
          link2.insertAtLast(new Node(2));
          link2.insertAtLast(new Node(3));
          link2.insertAtLast(l.head);//now l2 pointing toward starting link
          link1.insertAtLast(l.head);//now l1 pointing toward starting link
          
          
          System.out.println(link1);
          System.out.println(link2);
         Set a=new LinkedHashSet<>();
         Node start=link1.head;
         while(start!=null) {
        	 
        	 a.add(start.hashCode());
        	 start=start.getNext();
        	
        	 
         }
         System.out.println(a);
         Node temp2=link2.head;
         Node inter=null;
         while(temp2!=null) {
        	if(!(a.add(temp2.hashCode()))) {
        		
        		 inter=temp2;
        		break;
        	}
            temp2=temp2.getNext();

         }
        
         System.out.println(inter);////intersection of 2 nodes
         
         
}}
