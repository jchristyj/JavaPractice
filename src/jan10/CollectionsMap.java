package jan10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class CollectionsMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> m=new HashMap<String,String>();
		m.put("name", "jo");
		m.put("age", "34");
		
		//size
		System.out.println(m.size());
		/*clear to remove all values form map
		//m.clear();
		//System.out.println(m.size());*/
		//doesnot allow duplicate keys
		//m.put("name", "jancy");
		
		//Iterate values-first get the keys to iterate
	    Set<String> set = m.keySet();
		//for each loop
		//set= name ,age
		for(String set1:set)
		{
			System.out.println(m.get(set1));
		}
		//Iterator it=new Iterator();
		

	}

}
