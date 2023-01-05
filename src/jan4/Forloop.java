package jan4;

public class Forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10;
		for (int i = 1; i < num; i++) {
			System.out.println("increaing by 1 and value is " + (num + i));

			if (i == 5) {
				break;
			}
		}
		int num2 = 5;
		for (int j = 1; j < num2; j++) {

			if (j == 2) {
				continue;
			}
			System.out.println(j);

		}

	}

}
