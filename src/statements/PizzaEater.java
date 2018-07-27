package statements;

public class PizzaEater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1 pizza have 4 slice, it need 6 bite to finish 1 slice
		// eating slice number 1 : yum 1 yum 2 yum 3 yum 4 yum 5 finish
		// eating slice number 2 : yum 1 yum 2 yum 3 yum 4 yum 5 finish
		// .....

		int sliceCount = 4;
		int biteCount = 5;
		
		SliceLoop:
		for (int i = 1; i <= sliceCount; i++) {
			System.out.println("Eating slice number " + i);
			
			BiteLoop: 
			for (int j = 1; j <= biteCount; j++) {
				if(i==3) {
					System.out.println("leaving slice number 3 to my kid");
					continue SliceLoop; 
				}
				
				if(i==4 && i==2) {
					System.out.println(" I can not eat anymore!!!");
					break SliceLoop;
				}
				
				
				System.out.print(" yum " + j);

			}

			System.out.println(" Finish ");

		}

	}

}
