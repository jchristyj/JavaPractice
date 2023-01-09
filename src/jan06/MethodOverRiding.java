package jan06;
class Vehicle {
	void run() {
		System.out.println("Vehile is running");
	}
}	//Method over riding
class Bike extends Vehicle{
		void run() {
			System.out.println("Bike is running");
		}
}	
public class MethodOverRiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b1=new Bike();
		b1.run();

	}

}
