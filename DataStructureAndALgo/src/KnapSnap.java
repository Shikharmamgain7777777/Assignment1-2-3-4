import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KnapSnap {
	public static void main(String[] args) {
		
		List<Itams> l=new ArrayList<>();
	l.add(new Itams(25,18));
	l.add(new Itams(24,15));
	l.add(new Itams(15,10));
	System.out.println(l);
	Collections.sort(l);
	System.out.println(l);
	
	int input =20;
	double profit=0;
	for(int i=0;i<4;i++) {
		
		if(l.get(i).getWeight()<=input&&input>0) {
			
			input=input-l.get(i).getWeight();
			profit=l.get(i).getProfit()+profit;
			System.out.println(profit);
		}
		else {
			System.out.println(input);
			break;
		}
		if(input>0) {
			double d=(double)l.get(i).getProfit()/l.get(i).getWeight();
			System.out.println(d);
			profit=(profit+d*input);
		}
		
	}
	System.out.println(profit);
	}

}
