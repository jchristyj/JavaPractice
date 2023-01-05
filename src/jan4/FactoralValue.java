package jan4;

public class FactoralValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FactoralValue a = new FactoralValue();
		int Answer = a.factoral(6);
		System.out.println(Answer);

	}

	public int factoral(int number)

	{
		int fact = 1;
		for (int i = 1; i <= number; i++) {
			fact = i * fact;
		}
		return fact;

	}

}
