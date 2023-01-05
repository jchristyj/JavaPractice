package jan4;

public class MethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodTest a = new MethodTest();
		int add = a.sum(4, 5);
		System.out.println(add);
		int add1 = a.sum(40, 50);
		System.out.println(add1);

	}

	public int sum(int a, int b) {
		int sum = a + b;
		return sum;
	}
}
