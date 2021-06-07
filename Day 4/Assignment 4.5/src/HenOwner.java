
public class HenOwner {
	private boolean bool = true;
	
	synchronized void Hen(int i) {
		if(!bool) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Hen Laid the Egg - " + i);
		bool = 	false;
		notify();
	}
	synchronized void Owner(int i) {
		if(bool) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Owner gained Rs. " + i);
		bool = 	true;	
		notify();																																																																																			
	}															
}																																																																																																																																																																																																																																																																																																																																																																											
