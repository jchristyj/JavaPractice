package jan12;

import java.util.HashSet;
import java.util.Iterator;

public class IterateSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> listNames = new HashSet<String>();
		listNames.add("Jancy");
		listNames.add("chris");
		listNames.add("Johnson");
		listNames.add("Jessi");
		Iterator<String> it=listNames.iterator();
		//System.out.println(listNames);
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
		
		
	}

}
