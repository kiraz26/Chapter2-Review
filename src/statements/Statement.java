package statements;

public class Statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// if else
		int i = 100;
		if (i > 100) {
			System.out.println("It is more than 100");
		} else if (i > 150) {
			System.out.println("It is more than 150");
		} else {
			System.out.println("It is not more than 100");
		}

		// variable type in switch variable String, int, char, short, double
		switch (i) {

		case 100:
			System.out.println("It is 100");
			break;
		case 200:
			System.out.println("It is 200");
			break;
		default:
			System.out.println("It is not 100 or 200");

			
			
			
			
			
		}
		
	}

}
