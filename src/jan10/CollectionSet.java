package jan10;

import java.util.HashSet;
import java.util.Iterator;

public class CollectionSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String>h=new HashSet<String>();
		h.add("jo");
		h.add("christy");
		h.add("johnson");
		//h.remove("johnson");
		
		Iterator<String> it = h.iterator();
		if(it.hasNext()) {
					
			System.out.println(h);
		}
		

		
	}

}
