package stackUse;

import java.util.Arrays;
import java.util.Comparator;

public class myComparator implements Comparator {

	@Override
	public int compare(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		String o1=(String)arg0;
		String o2=(String)arg1;
		String[] s1=o1.split(",");
		System.out.println(Arrays.toString(s1));
		String[] s2=o2.split(",");
		System.out.println(Arrays.toString(s2));
		if((s1[0].equals(s2[0])&&s1[1].equals(s2[1]))||(s1[0].equals(s2[1])&&s1[1].equals(s2[0]))){
			System.out.println("hi");
			
			return 0;
		}
		else {
			return 1;
		}

	}

}
