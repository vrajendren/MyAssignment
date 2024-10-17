package week.day2;

public class PrintNumbers1to10 {

	public static void main(String[] args) {
		
		System.out.println("Print number from 1 to 10");
		for(int i=1; i<=10; i++) {
			System.out.print(i+" ");
		}
		
		System.out.print("\nThe values are ");
		for (int i = 0; i <11; i++) {
		
			if(i==4) {
				continue;
			}
			
			if(i%2==0) {
				System.out.print(i+", ");
			}
		}
		
	}
	
	
}

