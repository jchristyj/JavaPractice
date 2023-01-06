package jan05;

class Frog {
	
	String name;
	int age;
	
	public int setAge(int newAge) {
		age=newAge;
		return age;
	}
	
	public String setName(String newName) {
		name=newName;
		return name;
	}
	
	public String getName( ) {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
}
public class Setters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frog frog1=new Frog();
		frog1.name="sam";
		frog1.age=5;
		System.out.println(frog1.getName());
		System.out.println(frog1.getAge());
		System.out.println(frog1.name);
		String anmsw1=frog1.setName("chris");
		int answ=frog1.setAge(5);
		System.out.println(frog1.getName());
		System.out.println(answ);
		
	}

}
