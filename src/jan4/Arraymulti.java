package jan4;

public class Arraymulti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = { { 1, 2, 3 }, { 2, 4 }, { 5, 6, 7 } };
		System.out.println(grid[2][1]);
		for (int row = 0; row < grid.length; row++) {
			for (int col = 0; col < grid[row].length; col++) {
				System.out.print(grid[row][col] + "\t");
			}
			System.out.println();
		}

		String[][] text = new String[2][3];
		text[0][0] = "hello";
		text[1][2] = "welcome";
		System.out.println(text[0][0]);

		for (int row = 0; row < text.length; row++) {
			for (int col = 0; col < text[row].length; col++) {
				System.out.print(text[row][col] + "\t");
			}
			System.out.println();

		}

		// Multi dimensional Array of strings

		String[][] words = new String[2][];
		// explicitly declare for coloumn
		words[0] = new String[3];
		words[0][1] = "hi there";
		System.out.println(words[0][1]);

	}

}
