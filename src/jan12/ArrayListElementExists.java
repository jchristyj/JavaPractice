package jan12;

import java.util.ArrayList;

public class ArrayListElementExists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> names=new ArrayList<>();
		names.add("Jancy");
		names.add("chris");
		names.add("Johnson");
		System.out.println("Set of names"+names);
		for(int i=0;i<names.size();i++) {
			if(names.get(i).contains("Johnson")) {
				
				System.out.println(names.get(i));
			}
			
		}

	}

}
