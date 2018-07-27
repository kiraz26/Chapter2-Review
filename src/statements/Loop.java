package statements;

public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 0;
		while (i++ < 10) {  
			// i++;
			System.out.print(i + " ");

		}
		System.out.println();
		int j = 0;
		do {
			System.out.print(++j + " ");
		} while (j < 10);

		System.out.println();

		for (int k = 1; k < 11; k++) {
			System.out.print(k + " ");
		}

		System.out.println();

		int[] intArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		for (int item : intArr) {
			System.out.print(item+" ");
		}

	}

}
