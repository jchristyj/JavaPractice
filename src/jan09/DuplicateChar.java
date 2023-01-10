package jan09;

public class DuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// string

		String text = "jancy christy";
		DuplicateChar a=new DuplicateChar();
		a.duplichar(text);
		
	}
	public void duplichar(String text) {
		char[] newtext = text.toCharArray();
		for (int i = 0; i < text.length(); i++) {
			for (int j = i + 1; j < text.length(); j++) {

				if (newtext[i] == newtext[j]) {
					System.out.println(newtext[j]);
					break;

				}
			}

		}
		

	}

}
