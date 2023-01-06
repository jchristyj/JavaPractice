package jan05;

class Person {
	// instance variables-data or state,subroutine
	String name;
	int age;

	void speak() {
		System.out.println("My name is " + name + " my age is " + age);
	}
	void sayHello() {
		System.out.println("hello");
	}
	int getRetirementYearLeft() {
		int retYear = 65 - age;
		return retYear;
	}

	int getAge() {
		return age;
	}

	String getName() {
		return name;
	}
}

public class PrintNameAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person obj1 = new Person();
		obj1.name = "Jo";
		obj1.age = 10;
		/*
		 * System.out.println(obj1.name); obj1.speak(); obj1.sayHello();
		 */
		int year = obj1.getAge();
		System.out.println("My age is " + year);

		Person obj2 = new Person();
		obj2.name = "chris";
		obj2.age = 20;
		/*
		 * System.out.println(obj2.age); obj2.speak(); obj2.sayHello();
		 */
		String name1 = obj1.getName();
		System.out.println("My name is " + name1);
		int noOfYear = obj1.getRetirementYearLeft();
		System.out.println(noOfYear);

	}

}
