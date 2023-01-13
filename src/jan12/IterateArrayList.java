package jan12;

import java.util.ArrayList;

public class IterateArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> listNames = new ArrayList<String>();
		listNames.add("Jancy");
		listNames.add("chris");
		listNames.add("Johnson");
		for (int i = 0; i < listNames.size(); i++) {

			System.out.println(listNames.get(i));

		}

	}

}
