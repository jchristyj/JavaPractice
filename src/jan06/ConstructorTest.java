package jan06;
class ConstructorTest {
	int x;
    int y;	
    //Syntax for default constructor
    //no return typea,name same as class name
	ConstructorTest() {
		
		System.out.println("bike is created");
	}
	  //paramarized constructor
	ConstructorTest(int a,int b) {
		x=a;
		y=b;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//calls the paramerized constructor
		ConstructorTest c1=new ConstructorTest(3,5);
		ConstructorTest c2=new ConstructorTest(93,65);
		//calls the default constructor
		ConstructorTest c=new ConstructorTest();
		System.out.println(c1.x+c1.y);
		
	}

}
