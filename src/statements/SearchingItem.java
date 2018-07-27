package statements;

public class SearchingItem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int found6AtIndex = -1;
		int[] intArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		for (int i = 0; i < intArr.length; i++) {
			if (intArr[i] == 6) {
				found6AtIndex = i;
				break;
			}
		}
		System.out.println("6 is found at index " + found6AtIndex);
	}

}
