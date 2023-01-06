package jan05;

public class Member implements Info {
	
	private String name;
	
	public Member(String name) {
		this.name = name;
	}

	public void great() {
		System.out.println("hello there");
		
	}

	@Override
	public void showInfoMessage() {
		System.out.println("Person name is "+name);
		
	}
	

}
