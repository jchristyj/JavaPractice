package jan06;
//Class subclass extends superclass
class Animal {

	public void cat() {
		System.out.println("I am a cat");
	}
	public void dog() {
		System.out.println("I am a dog");
	}
	
}
class Sound extends Animal {
	public void catSound() {
		System.out.println("and i meoww");		
	}
	public void dogSound() {
		System.out.println("and i meoww");
	}	
}
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal A1 = new Animal();
		A1.cat();
		Sound S1=new Sound();
		S1.catSound();
		

	}

}
