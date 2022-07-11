package arrayspractice;

import java.util.concurrent.ThreadLocalRandom;

public class RandumNo {


	
	
	public static void main(String[] args) {
		

		for(int i =0; i<10; i++) {
			System.out.println(ThreadLocalRandom.current().nextInt(100, 1000 +1));

		}

	}
}
