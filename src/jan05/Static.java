package jan05;

class Thing {
    public static final int LUCKYNUMBER=7;
	public String name;// instance variables -every variable gets its copy
	public static String description;
	public static int count=0;

	public void getName() {
		//can use static instance
		System.out.println(description+ " is " +name);
	}

	public static void getInfo() {
		System.out.println("hello");
		System.out.println(description);
		// normal instance variable wont work instatic method System.out.println(name)
	}
	public Thing() {
		count++;
	}
	
}

public class Static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thing.description = "I am a thing";
		// System.out.println(Thing.description);
		
		System.out.println("Before creating objects, count is "+Thing.count);

		Thing thing1 = new Thing();
		Thing thing2 = new Thing();
		
		System.out.println("Before creating objects, count is "+Thing.count);

		// need to call static method using the class
		Thing.getInfo();
		thing1.name = "bob";
		thing2.name = "sue";
		
		// System.out.println(thing1.name);
		// System.out.println(thing2.name);
		// System.out.println(thing1.description);

		thing1.getName();
		thing2.getName();
		//static variable
		System.out.println(Math.PI);
		System.out.println(Thing.LUCKYNUMBER);

	}

}
