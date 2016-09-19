
public class Classic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long timeBefore = System.nanoTime();
		for (int i = 0; i<1000000; i++){
			System.out.println(i+1);
			
		}
		long timeAfter = System.nanoTime();
		
		System.out.println("Time in seconds is " + (timeAfter-timeBefore)/1000000000.00 + "s");
		
	}

}
