package loops;

public class ForLoop {

	public static void main(String[] args) {
		 
		System.out.println("This is for loop");
		int counter;
		for(counter=0; counter<=10; counter++) {
		System.out.print(counter+ " ");
		}
		
		System.out.println("\nThis is while loop");
		int counter1=0;
		while(counter1<11) {
			System.out.print(counter1+" ");
			counter1++;
		}
		System.out.println("\nThis is do while loop");
		int counter2=0;
		do {
			System.out.print(counter2+" ");
			counter2++;
		}
		while (counter2<=10);
		
	}

}
