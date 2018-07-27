package statements;

public class NestedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rowCount = 5;
		int colCount = 4;
		
		RowLabel:
		for (int i = 1; i <= rowCount; i++) {

			System.out.println("----at row number " + i);
			
			if(i==2) {
				continue;
			}
			
			ColLabel:
			for (int j = 1; j <= colCount; j++) {
//				if(i==2) continue RowLabel;
//				// Cell(1,2) Cell(1,2)........
				
//				if(i==3 && j==3) {
//					break RowLabel;
//				}
				if(i==4 && j==2) {
					continue ColLabel;
				}
				System.out.print("****Cell( " + i + ", " + j + ") ");
				

			}
			System.out.println();
		}

	}

}
