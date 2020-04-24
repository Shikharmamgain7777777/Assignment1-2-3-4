package stackUse;

import java.util.HashSet;
import java.util.TreeSet;

public class RemoveDup {
public static void main(String[] args) {
	
	
	String[] arr= {"a,a","a,b","a,b","a,c","b,a","c,c","a,b","a,c","c,c","a,b","c,c"};
	
	//by using tree set myCompartor class
	TreeSet<String> t=new TreeSet<>(new myComparator());
	//uding hashset
	HashSet<PojoForRemoveDup > hs=new HashSet<>();
	for(int i=0;i<arr.length;i++) {
		
		hs.add(new PojoForRemoveDup(arr[i]));
		t.add(arr[i]);
	}
	System.out.println(t);
	System.out.println();
}
}
