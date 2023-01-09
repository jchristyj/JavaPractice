package jan06;
class Operation {

	public int add(int a, int b) {
    return a+b;
    }

	public int add(int a, int b, int c) {
	int y=a+b+c;
	return y;

	}
}

public class MethodOverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operation op1=new Operation();
		int x=op1.add(2, 3);
		int d=op1.add(1, 2, 3);
		System.out.println(x);
		System.out.println(d);
		
		
		
		
		
		

	}

}
