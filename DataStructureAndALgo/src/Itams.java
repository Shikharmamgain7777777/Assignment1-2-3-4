

public class Itams implements Comparable<Itams> {
private int weight,profit;

public int getWeight() {
	return weight;
}

public void setWeight(int weight) {
	this.weight = weight;
}

public int getProfit() {
	return profit;
}

@Override
public String toString() {
	return "Itams [weight=" + weight + ", profit=" + profit + "]";
}

public Itams(int profit, int weight) {
	super();
	this.weight = weight;
	this.profit = profit;
}

public Itams() {
	super();
	// TODO Auto-generated constructor stub
}

public void setProfit(int profit) {
	this.profit = profit;
}

@Override
public int compareTo(Itams arg) {
	// TODO Auto-generated methodp stub+
	System.out.println(profit+"="+weight);
	double e1=(double)this.profit/this.weight;
	double e2=(double)arg.getProfit()/arg.getWeight();System.out.println(e1+"e1");
	System.out.println(e2+"e2");
 if(e1>e2) 
{	return -1;}
 else  if(e1<e2) 
	{
	return 1;}
 
	else {
	
	return 0;
}
}

}
