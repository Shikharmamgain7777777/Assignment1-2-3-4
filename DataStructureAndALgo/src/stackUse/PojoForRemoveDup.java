package stackUse;

public class PojoForRemoveDup {
private String s1;
private String s2;
public PojoForRemoveDup(String s) {
	
	String[] arr=s.split(",");
	this.s1=arr[0];
	this.s2=arr[1];
	
}
@Override
public int hashCode() {
	
	

/*	System.out.println("hi");
	System.out.println(s1.hashCode()+s2.hashCode());*/
	return s1.hashCode()+s2.hashCode();
}
@Override
public String toString() {
	return "PojoForRemoveDup [s1=" + s1 + ", s2=" + s2 + "]";
}
@Override
public boolean equals(Object obj) {


return true;
}

}
