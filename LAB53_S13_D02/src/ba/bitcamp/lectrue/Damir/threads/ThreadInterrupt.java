package ba.bitcamp.lectrue.Damir.threads;

import java.util.Scanner;

public class ThreadInterrupt {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Program pocinje!");
		final Thread firstThread = new Thread() {

			@Override
			public void run() {
				for (int i=0; i<5; i++){
					try {
						//firstThread je interrupted tako da nikad ne ulazi program u try block
						// odmah prelazi na chatch blok i prelazi u catch blok.
						sleep(3000);
						System.out.println("Dobro jutro radni narode!");
					} catch (InterruptedException e) {
						System.out.println("Nesto nije uredu, probudio si me!");
					}
				}
				

			}

		};

		Thread secondThread = new Thread() {
			@Override
			public void run() {
				try {
					sleep(1500);
					System.out.println("Ko rano rani, dvije srece grabi!");
					firstThread.interrupt();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		
//		firstThread.setDaemon(true);
//		secondThread.setDaemon(true);
		
		firstThread.start();
		secondThread.start();
		
		firstThread.join();
		
		try {
			firstThread.join();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
/*		Scanner scan =  new Scanner(System.in);
		scan.nextLine();     // ceka da ukucamo enter da bi program ispisao "Program je gotov!"
*/				
		System.out.println("Program je gotov!");
	}
}
