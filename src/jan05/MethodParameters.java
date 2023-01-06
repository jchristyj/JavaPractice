package jan05;

class Robot{
	
	public void speak(String text) {
		System.out.println(text);
	}
	public void jump(int height) {
		System.out.println("My height is "+height);
	}
	public void move(String direction, int distance) {
		System.out.println("Move to "+ direction + " and distance " + distance + " feet ");
	}
}
public class MethodParameters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot sam=new Robot();
		sam.speak("hello i am sam");
		sam.jump(3);
		sam.move("left", 29);
		//passing new string into method
		String greeting="hello";
		sam.speak(greeting);
		//passing value in method
		int value=8;
		sam.jump(value);
	 	}

}
