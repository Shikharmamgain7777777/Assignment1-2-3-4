import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.rmi.ssl.SslRMIClientSocketFactory;

public class SortHashMapInJava8 {
	public static void main(String[] args) {
		
		
		
		
		


		
		
		Map<Integer,Integer> map=new HashMap<>();
		map.put(1, 10);
		map.put(2, 1);
		map.put(3, 5);
		map.put(4, 7);
	Map<Integer,Integer> sorted=map.entrySet().stream().sorted(Map.Entry.<Integer, Integer> comparingByValue())
        .collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

	
	System.out.println(sorted);

	}

}
