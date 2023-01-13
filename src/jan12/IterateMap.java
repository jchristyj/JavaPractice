package jan12;

import java.util.HashMap;
import java.util.Set;

public class IterateMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> values=new HashMap<String,String>();
		values.put("name", "jancy");
		values.put("age", "35");
		Set<String> s=values.keySet();
		for (String answer:s) {
			System.out.println(values.get(answer));
		}

	}

}
