package jan10;
import java.util.ArrayList;

public class CollectionsList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		
		//get length
		System.out.println(a.size());
		//remove
		//a.remove(0);
		//to retreive
		//System.out.println(a.get(0));
		
		ArrayList<String> s=new ArrayList<String>();
		s.add("jancy");
		s.add("christy");
		System.out.println(s.get(1));
		//set function
		s.set(1, "johnson");
		System.out.println(s.get(1));
		

	}

}
