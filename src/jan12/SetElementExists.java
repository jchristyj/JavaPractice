package jan12;

import java.util.HashSet;
import java.util.Iterator;

public class SetElementExists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> names=new HashSet<String>();
		names.add("Jancy");
		names.add("chris");
		names.add("Johnson");
		names.add("Jessi");
		names.add("Janet");
		names.add("Jacky");
		System.out.println("Set of names"+names);
		Iterator<String> it = names.iterator();
		while(it.hasNext()) {
				//System.out.println(it.next());
				if(it.next().contains("Janet")) {
					System.out.println("Janet is present");
					it.next();
				}
			}
		}
		

	}


