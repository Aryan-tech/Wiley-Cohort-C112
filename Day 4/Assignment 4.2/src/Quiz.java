																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																														

public class Quiz {

	private boolean flag=true;
	
	synchronized void showQuestion(String question) {
		while(!flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+" : "+question);
		flag = false;
		notify();
		
	}

	
	synchronized void showAnswer(String answer , String s) {
		while(flag) {
			try {
				wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
		if(answer.equalsIgnoreCase(s)) {
			System.out.println("Your answer is correct..");
			flag = true;
			notify();
		}
		else {
			System.out.print("Sorry you are wrong...Good Bye");
			System.exit(0);
		}
	
	}
	}
																																																																																																																																																																																																																																																